package dao;

import db.DBConnection; 
import models.Transaction; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    public List<Transaction> getDonationHistoryByDonor(int donorId) {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transactions WHERE donor_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
             
            stmt.setInt(1, donorId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Transaction transaction = new Transaction();
                    transaction.setTransactionId(rs.getInt("transaction_id"));
                    transaction.setAmount(rs.getDouble("amount"));
                    transaction.setDate(rs.getDate("date"));
                    transactions.add(transaction);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Consider using a logging framework here
        }
        return transactions;
    }
}
