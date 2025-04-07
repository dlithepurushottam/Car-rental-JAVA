<%@ page import="dao.CharityDAO, models.Charity, java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Donate</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<h2>Select a Charity Campaign to Donate</h2>
<form action="PaymentServlet" method="post">
<label>Select Charity:</label>
<select name="charityId" required>
<%
List<Charity> charities = CharityDAO.getAllCharities();
for (Charity charity : charities) {
%>
<option value="<%= charity.getCharityId() %>"><%=charity.getCharityName() %></option>
<%
}
%>
</select><br>
<label>Donation Amount:</label>
<input type="text" name="amount" required><br>
<button type="submit">Donate Now</button>
</form>
</body>
</html>