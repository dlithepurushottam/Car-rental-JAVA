//package controllers;
//
//import com.razorpay.Order;
//import com.razorpay.RazorpayClient;
//import org.json.JSONObject;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//
//@WebServlet("/PaymentServlet")
//public class PaymentServlet extends HttpServlet {
//    private static final String RAZORPAY_KEY_ID = "your_key_id";
//    private static final String RAZORPAY_SECRET = "your_secret_key";
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String amount = request.getParameter("amount");
//
//        try {
//            // Initialize Razorpay client
//            RazorpayClient razorpayClient = new RazorpayClient(RAZORPAY_KEY_ID, RAZORPAY_SECRET);
//
//            // Create a new order request
//            JSONObject orderRequest = new JSONObject();
//            orderRequest.put("amount", Integer.parseInt(amount) * 100); // Amount in paise
//            orderRequest.put("currency", "INR");
//            orderRequest.put("receipt", "txn_123456");
//
//           
//            Order order = razorpayClient.Orders.create(orderRequest);
//
//            // Set the order id in request attribute
//            request.setAttribute("order_id", order.get("id"));
//
//            // Forward to payment page
//            request.getRequestDispatcher("paymentPage.jsp").forward(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//            response.sendRedirect("donate.jsp?error=Payment initiation failed");
//        }
//    }
//}
