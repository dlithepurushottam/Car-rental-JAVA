package controllers;

import dao.AdminDAO;
import models.Admin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Attempt to find the admin by email and validate the password
        Admin admin = AdminDAO.login(email, password);

        // Check if admin is found and credentials are correct
        if (admin != null) {
            // If valid, set the admin session and redirect to the dashboard
            request.getSession().setAttribute("admin", admin);
            response.sendRedirect("adminDashboard.jsp");
        } else {
            // If login fails, redirect to login page with an error
            response.sendRedirect("adminLogin.jsp?error=Invalid login");
        }
    }
}
