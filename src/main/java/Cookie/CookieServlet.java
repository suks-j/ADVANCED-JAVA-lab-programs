package Cookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie nameCookie = null;
        Cookie countCookie = null;

        Cookie[] cookies = request.getCookies();

        int visitCount = 0;

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    countCookie = c;
                    visitCount = Integer.parseInt(c.getValue());
                }
            }
        }

        // If first visit
        if (nameCookie == null) {
            nameCookie = new Cookie("username", name);
            visitCount = 1;
        } else {
            visitCount++;
        }

        // Update visit count cookie
        countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // 🔥 Set expiry time (IMPORTANT PART)
        nameCookie.setMaxAge(30);        // 30 seconds
        countCookie.setMaxAge(30);       // expires after 30 seconds

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        out.println("<p><b>Note:</b> Cookie will expire in 30 seconds.</p>");

        out.println("</body></html>");
    }
}