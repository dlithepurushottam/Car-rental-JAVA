<%@ page import="dao.DonorDAO, models.Donor, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Manage Donors</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h2>Donor Details</h2>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>Address</th>
<th>Registered Date</th>
</tr>
<%
List<Donor> donors = DonorDAO.getAllDonors();
for (Donor donor : donors) {
%>
<tr>
<td><%= donor.getDonorId() %></td>
<td><%= donor.getFirstName() + " " + donor.getLastName()
%></td>
<td><%= donor.getEmail() %></td>
<td><%= donor.getPhone() %></td>
<td><%= donor.getAddress() %></td>
<td><%= donor.getRegisteredDate() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>