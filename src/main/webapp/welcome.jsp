<%@ page import="java.util.*" %>
<html>
<body>

<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    HttpSession sessionObj = request.getSession();

    if (name != null && timeStr != null) {

        int time = Integer.parseInt(timeStr);

        // Set session expiry time
        sessionObj.setMaxInactiveInterval(time);

        // Store name
        sessionObj.setAttribute("username", name);
    }

    String storedName = (String) sessionObj.getAttribute("username");

    if (storedName != null) {
%>
        <h2>Hello <%= storedName %>!</h2>
        <p>Session expiry time set successfully.</p>

        <a href="check.jsp">Click here to check session</a>

<%
    } else {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>