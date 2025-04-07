package controllers;

import dao.CharityDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CharityApprovalServlet")
public class CharityApprovalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        String charityIdParam = request.getParameter("charityId");

        // Check if the action and charityId are present
        if (action == null || charityIdParam == null) {
            response.sendRedirect("viewCharities.jsp?error=Invalid parameters");
            return;
        }

        try {
            int charityId = Integer.parseInt(charityIdParam);

            // Handle charity approval or rejection
            if ("approve".equals(action)) {
                boolean isUpdated = CharityDAO.updateCharityStatus(charityId, "Approved");
                if (isUpdated) {
                    response.sendRedirect("viewCharities.jsp?success=Charity approved");
                } else {
                    response.sendRedirect("viewCharities.jsp?error=Approval failed");
                }
            } else if ("reject".equals(action)) {
                boolean isUpdated = CharityDAO.updateCharityStatus(charityId, "Rejected");
                if (isUpdated) {
                    response.sendRedirect("viewCharities.jsp?success=Charity rejected");
                } else {
                    response.sendRedirect("viewCharities.jsp?error=Rejection failed");
                }
            } else {
                response.sendRedirect("viewCharities.jsp?error=Invalid action");
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("viewCharities.jsp?error=Invalid charity ID");
        }
    }
}
