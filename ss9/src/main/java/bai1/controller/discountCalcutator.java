package bai1.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Discount" , value = "/discount")
public class discountCalcutator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        String listPriceStr = req.getParameter("listPrice");
        String discountPercentStr = req.getParameter("discountPercent");

        double listPrice = Double.parseDouble(listPriceStr);
        double discountPercent = Double.parseDouble(discountPercentStr);
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Product Discount Calculator</h1>");
        out.println("<p>Product Description: " + description + "</p>");
        out.println("<p>List Price: $" + listPrice + "</p>");
        out.println("<p>Discount Percent: " + discountPercent + "%</p>");
        out.println("<p>Discount Amount: $" + discountAmount + "</p>");
        out.println("<p>Discount Price: $" + discountPrice + "</p>");
        out.println("</body></html>");

    }
}
