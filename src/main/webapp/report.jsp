<%@ page import="java.sql.*" %>

<html>
<body>

<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

<%
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/Employee","root","root");

PreparedStatement ps = con.prepareStatement(
    "SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'");

ResultSet rs = ps.executeQuery();

while(rs.next()) {
%>

<pre>
Emp_No : <%= rs.getInt("Emp_NO") %>
Emp_Name : <%= rs.getString("Emp_Name") %>
Basic : <%= rs.getInt("Basicsalary") %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

<%
}
%>

</body>
</html>