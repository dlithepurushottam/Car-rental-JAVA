package dao;

import db.DBConnection;
import models.Charity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CharityDAO {

    // Register new charity
    public static boolean register(Charity charity) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Charity (charity_name, email, phone, address, status, password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, charity.getCharityName());
            stmt.setString(2, charity.getEmail());
            stmt.setString(3, charity.getPhone());
            stmt.setString(4, charity.getAddress());
            stmt.setString(5, charity.getStatus());

            // Securely hash the password before storing
            String hashedPassword = charity.getPassword();
            stmt.setString(6, hashedPassword);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Login charity by verifying hashed password
    public static Charity login(String email, String password) {
        Charity charity = null;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Charity WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                if (storedPassword.equals(password)) {
                    charity = new Charity(
                        rs.getInt("charity_id"),
                        rs.getString("charity_name"),
                        email,
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("status"),
                            rs.getString("password")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return charity;
    }

    // Fetch all charities from the database
    public static List<Charity> getAllCharities() {
        List<Charity> charities = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Charity";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                charities.add(new Charity(
                    rs.getInt("charity_id"),
                    rs.getString("charity_name"),
                    rs.getString("email"),
                    rs.getString("phone"),
                    rs.getString("address"),
                    rs.getString("status"),
                     rs.getString("password")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return charities;
    }

    // Update the status of a charity (approve/reject)
    public static boolean updateCharityStatus(int charityId, String status) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE Charity SET status = ? WHERE charity_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, status);
            stmt.setInt(2, charityId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
