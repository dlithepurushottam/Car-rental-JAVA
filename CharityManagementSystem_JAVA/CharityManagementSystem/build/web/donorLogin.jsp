<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Donor Login</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<form action="DonorController" method="post">
<input type="hidden" name="action" value="login">
<label>Email:</label><input type="email" name="email" required><br>
<label>Password:</label><input type="password" name="password"
required><br>
<button type="submit">Login</button>
</form>
</body>
</html>