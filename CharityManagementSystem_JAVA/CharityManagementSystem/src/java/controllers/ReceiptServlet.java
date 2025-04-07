//package controllers;
//
//import db.DBConnection;
//import org.apache.pdfbox.pdmodel.*;
//import org.apache.pdfbox.pdmodel.common.PDRectangle;
//import org.apache.pdfbox.pdmodel.font.PDType1Font;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@WebServlet("/generateReceipt")
//public class ReceiptServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        int donationId;
//        try {
//            donationId = Integer.parseInt(request.getParameter("donationId"));
//        } catch (NumberFormatException e) {
//            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid donation ID.");
//            return;
//        }
//
//        String donorName = null;
//        String amount = null;
//
//        // Fetch donation details from the database
//        try (Connection conn = DBConnection.getConnection()) {
//            String sql = "SELECT d.first_name, d.last_name, t.amount " +
//                         "FROM donors d " +
//                         "JOIN transactions t ON d.donor_id = t.donor_id " +
//                         "WHERE t.transaction_id = ?";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, donationId);
//            ResultSet rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                donorName = rs.getString("first_name") + " " + rs.getString("last_name");
//                amount = String.valueOf(rs.getDouble("amount"));
//            } else {
//                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Donation record not found.");
//                return;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error.");
//            return;
//        }
//
//        // Create the PDF document
//        try (PDDocument doc = new PDDocument()) {
//            PDPage page = new PDPage(PDRectangle.A4);
//            doc.addPage(page);
//
//            try (PDPageContentStream contentStream = new PDPageContentStream(doc, page)) {
//                contentStream.beginText();
//                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
//                contentStream.newLineAtOffset(100, 750);
//                contentStream.showText("Receipt for Donation");
//
//                contentStream.setFont(PDType1Font.HELVETICA, 12);
//                contentStream.newLineAtOffset(0, -40);
//                contentStream.showText("Donor Name: " + donorName);
//
//                contentStream.newLineAtOffset(0, -20);
//                contentStream.showText("Amount: $" + amount);
//
//                contentStream.newLineAtOffset(0, -20);
//                contentStream.showText("Donation ID: " + donationId);
//
//                contentStream.endText();
//            }
//
//            // Set response type and headers for PDF download
//            response.setContentType("application/pdf");
//            response.setHeader("Content-Disposition", "attachment; filename=receipt.pdf");
//
//            // Save the PDF document to the response output stream
//            doc.save(response.getOutputStream());
//        }
//    }
//}
