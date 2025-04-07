package dao;
import db.DBConnection;
import models.Admin;
import java.sql.*;
public class AdminDAO {
public static Admin login(String email, String password) {
Admin admin = null;
try (Connection conn = DBConnection.getConnection()) {
String sql = "SELECT * FROM Admin WHERE email = ? AND password= ?";
PreparedStatement stmt = conn.prepareStatement(sql);
stmt.setString(1, email);
stmt.setString(2, password);
ResultSet rs = stmt.executeQuery();
if (rs.next()) {
admin = new Admin(rs.getInt("admin_id"),rs.getString("first_name"),rs.getString("last_name"),email);
}
} catch (SQLException e) {
e.printStackTrace();
}
return admin;
}
}