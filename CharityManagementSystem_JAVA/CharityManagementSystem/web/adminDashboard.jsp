<%@ page import="dao.DonorDAO, dao.CharityDAO, dao.CampaignDAO,
dao.TransactionDAO, models.Donor, models.Charity, models.Campaign,
models.Transaction, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h1>Admin Dashboard</h1>
<nav>
<a href="adminDashboard.jsp">Home</a>
<a href="viewDonors.jsp">Donor Details</a>
<a href="viewCharities.jsp">Charity Details</a>
<a href="viewCampaigns.jsp">Campaigns</a>
<a href="viewTransactions.jsp">Transactions</a>
<a href="LogoutServlet">Logout</a>
</nav>
<h2>Welcome, Admin</h2>
</body>
</html>