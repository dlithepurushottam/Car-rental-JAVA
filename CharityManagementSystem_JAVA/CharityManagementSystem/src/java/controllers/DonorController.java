package controllers;

import dao.DonorDAO;
import models.Donor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/DonorController")
public class DonorController extends HttpServlet {

    // Handle POST requests for registration and login
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        // Handling registration
        if (action.equals("register")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String password = request.getParameter("password");

            // Create a new Donor object with the collected data
            Donor donor = new Donor(0, firstName, lastName, email, phone, address, password);

            // Register the donor using the DonorDAO
            boolean isRegistered = DonorDAO.register(donor);

            // Redirect based on registration success or failure
            if (isRegistered) {
                response.sendRedirect("donorLogin.jsp?success=Registeredsuccessfully");
            } else {
                response.sendRedirect("donorRegister.jsp?error=Registrationfailed");
            }

        // Handling login
        } else if (action.equals("login")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // Attempt to log in the donor using the DonorDAO
            Donor donor = DonorDAO.login(email, password);

            // If login is successful, set the session and redirect to the dashboard
            if (donor != null) {
                HttpSession session = request.getSession();
                session.setAttribute("donor", donor);
                response.sendRedirect("donorDashboard.jsp");

            // If login fails, redirect to login page with error message
            } else {
                response.sendRedirect("donorLogin.jsp?error=Invalidlogin");
            }
        }
    }
}
