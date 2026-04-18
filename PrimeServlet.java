package com.prime;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output
        out.println("<html><body>");
        out.println("<h2>Result:</h2>");

        if (isPrime) {
            out.println("<h3>" + num + " is a PRIME number</h3>");
        } else {
            out.println("<h3>" + num + " is NOT a prime number</h3>");
        }

        out.println("</body></html>");
    }
}