<%@ page import="java.util.*" %>
<html>
<body>

<%
    HttpSession sessionObj = request.getSession(false);

    if (sessionObj != null) {

        String name = (String) sessionObj.getAttribute("username");

        if (name != null) {
%>
            <h2>Hello <%= name %>! (Session Active)</h2>
<%
        } else {
%>
            <h2>Session Expired!</h2>
<%
        }

    } else {
%>
        <h2>Session Expired!</h2>
<%
    }
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>