package org.example.proddiscountcal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("descript");
        Float listPrice = Float.parseFloat(req.getParameter("price"));
        Float discountPercent = Float.parseFloat(req.getParameter("discnt"));

        Float discountAmount = (float) (listPrice * discountPercent * 0.01);
        Float discountPrice = listPrice - discountAmount;
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
        writer.println("</html>");
    }
}
