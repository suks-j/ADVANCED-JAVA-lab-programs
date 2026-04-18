package factorialServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input from HTML form
        int num = Integer.parseInt(request.getParameter("num"));

        long factorial = 1;

        // Calculate factorial
        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        // Display output
        out.println("<html><body>");
        out.println("<h2>Factorial of " + num + " is: " + factorial + "</h2>");
        out.println("</body></html>");
    }
}