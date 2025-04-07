<%@ page import="dao.CharityDAO, models.Charity, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Manage Charities</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h2>Charity Details</h2>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>Address</th>
<th>Status</th>
<th>Action</th>
</tr>
<%
List<Charity> charities = CharityDAO.getAllCharities();
for (Charity charity : charities) {
%>
<tr>
<td><%= charity.getCharityId() %></td>
<td><%= charity.getCharityName() %></td>
<td><%= charity.getEmail() %></td>
<td><%= charity.getPhone() %></td>
<td><%= charity.getAddress() %></td>
<td><%= charity.getStatus() %></td>
<td>
<form action="CharityApprovalServlet" method="post">
<input type="hidden" name="charityId" value="<%=
charity.getCharityId() %>">
<button name="action" value="approve">Approve</button>
<button name="action" value="reject">Reject</button>
</form>
</td>
</tr>
<%
}
%>
</table>
</body>
</html>