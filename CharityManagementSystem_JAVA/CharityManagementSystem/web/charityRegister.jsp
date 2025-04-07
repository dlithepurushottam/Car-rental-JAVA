<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="models.Charity" %>
<%@ page import="dao.CharityDAO" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register Charity</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"],
        textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border-radius: 4px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #5cb85c;
            color: #ffffff;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-top: 20px;
        }
        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
        .message {
            text-align: center;
            margin-top: 15px;
            color: red;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Register New Charity</h2>

        <%
            String message = "";
            if (request.getMethod().equalsIgnoreCase("POST")) {
                String charityName = request.getParameter("charityName");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                String status = "Pending"; // Default status upon registration
                String password = request.getParameter("password");

                // Create a Charity object
                Charity charity = new Charity(0, charityName, email, phone, address, status, password);

                // Attempt to register the charity
                if (CharityDAO.register(charity)) {
                    response.sendRedirect("controllers/CharityController");
                    return; // Stop further processing of this JSP after redirect
                } else {
                    message = "Registration failed. Please try again.";
                }
            }
        %>

        <form method="post" action="register.jsp">
            <label for="charityName">Charity Name:</label>
            <input type="text" name="charityName" id="charityName" required>

            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>

            <label for="phone">Phone:</label>
            <input type="text" name="phone" id="phone" required>

            <label for="address">Address:</label>
            <textarea name="address" id="address" required></textarea>

            <label for="password">Password:</label>
            <input type="password" name="password" id="password" required>

            <input type="submit" value="Register">
        </form>

        <div class="message"><%= message %></div>
    </div>
</body>
</html>
