<%@ page import="javax.servlet.http.*" %>
<html>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                Name: <%= c.getName() %> <br>
                Value: <%= c.getValue() %> <br>
                Max Age: <%= c.getMaxAge() %> <br>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No cookies found.</p>
<%
    }
%>

</body>
</html>