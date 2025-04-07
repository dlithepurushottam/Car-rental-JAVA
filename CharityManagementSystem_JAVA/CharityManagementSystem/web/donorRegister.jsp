<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Donor Registration</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<form action="DonorController" method="post">
<input type="hidden" name="action" value="register">
<label>First Name:</label><input type="text" name="firstName"
required><br>
<label>Last Name:</label><input type="text" name="lastName"
required><br>
<label>Email:</label><input type="email" name="email" required><br>
<label>Phone:</label><input type="text" name="phone" required><br>
<label>Address:</label><textarea name="address"
required></textarea><br>
<label>Password:</label><input type="password" name="password"
required><br>
<button type="submit">Register</button>
</form>
</body>
</html>