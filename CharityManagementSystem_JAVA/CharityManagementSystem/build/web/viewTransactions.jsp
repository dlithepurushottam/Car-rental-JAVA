<%@ page import="dao.TransactionDAO, models.Transaction, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Transactions</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h2>Transactions</h2>
<table border="1">
<tr>
<th>Transaction ID</th>
<th>Donor Name</th>
<th>Charity Name</th>
<th>Campaign Name</th>
<th>Payment Mode</th>
<th>Donation Amount</th>
<th>Paid On</th>
</tr>
<%
List<Transaction> transactions =
TransactionDAO.getAllTransactions();
for (Transaction transaction : transactions) {
%>
<tr>
<td><%= transaction.getTransactionId() %></td>
<td><%= transaction.getDonorName() %></td>
<td><%= transaction.getCharityName() %></td>
<td><%= transaction.getCampaignName() %></td>
<td><%= transaction.getPaymentMode() %></td>
<td><%= transaction.getAmount() %></td>
<td><%= transaction.getPaidOn() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>