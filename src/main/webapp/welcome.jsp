<%@ page import="java.io.*" %>
<html>
<body>

<%
    String name = request.getParameter("username");

    // Get existing session or create new one
    HttpSession sessionObj = request.getSession();

    // Set session expiry time to 60 seconds (1 minute)
    sessionObj.setMaxInactiveInterval(60);

    if (name != null) {
        // Store name in session
        sessionObj.setAttribute("username", name);
    }

    String storedName = (String) sessionObj.getAttribute("username");

    if (storedName != null) {
%>
        <h2>Hello <%= storedName %>!</h2>
        <p>Session will expire in 1 minute.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.html">Go Back</a>
<%
    }
%>

</body>
</html>