package dao;

import db.DBConnection;
import models.Donor;
import java.sql.*;

public class DonorDAO {

    public static boolean register(Donor donor) {
        String sql = "INSERT INTO Donor (first_name, last_name, email, phone, address, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, donor.getFirstName());
            stmt.setString(2, donor.getLastName());
            stmt.setString(3, donor.getEmail());
            stmt.setString(4, donor.getPhone());
            stmt.setString(5, donor.getAddress());
            stmt.setString(6, donor.getPassword()); // Use hashed password here
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Replace with logging
            return false;
        }
    }

    public static Donor login(String email, String password) {
        Donor donor = null;
        String sql = "SELECT * FROM Donor WHERE email = ? AND password = ?"; // Avoid storing passwords in plain text
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, password); // Compare hashed passwords instead
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                donor = new Donor(
                    rs.getInt("donor_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    email,
                    rs.getString("phone"),
                    rs.getString("address"),
                    rs.getString("password") // Ideally, do not set this field in the response
                );
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Replace with logging
        }
        return donor;
    }
}
