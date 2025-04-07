package controllers;

import dao.CharityDAO;
import models.Charity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CharityController")
public class CharityController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        // Ensure that the action parameter is not null or empty
        if (action == null || action.isEmpty()) {
            response.sendRedirect("errorPage.jsp?error=Invalid action");
            return;
        }

        // Handle Registration action
        if (action.equals("register")) {
            String name = request.getParameter("charityName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String password = request.getParameter("password");

            // Create Charity object with status "Inactive"
            Charity charity = new Charity(0, name, email, phone, address, "Inactive" , password);

            // Register the charity
            boolean isRegistered = CharityDAO.register(charity);

            // Redirect based on the registration status
            if (isRegistered) {
                response.sendRedirect("charityLogin.jsp?success=Registered successfully");
            } else {
                response.sendRedirect("charityRegister.jsp?error=Registration failed");
            }

        // Handle Login action
        } else if (action.equals("login")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // Attempt to login the charity
            Charity charity = CharityDAO.login(email, password);

            // If login is successful, set session and redirect to dashboard
            if (charity != null) {
                HttpSession session = request.getSession();
                session.setAttribute("charity", charity);
                response.sendRedirect("charityDashboard.jsp");

            // If login fails, redirect to login page with error message
            } else {
                response.sendRedirect("charityLogin.jsp?error=Invalid login credentials");
            }
        }
    }
}
