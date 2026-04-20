<%@ page import="java.sql.*" %>

<%
Connection con = null;
PreparedStatement ps = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee","root","root");

    String query = "DELETE FROM Emp WHERE Emp_Name LIKE 'S%'";
    ps = con.prepareStatement(query);

    int rows = ps.executeUpdate();

    out.println("<h3>" + rows + " record(s) deleted successfully!</h3>");
    out.println("<a href='report.jsp'>View Updated Report</a>");

} catch(Exception e) {
    out.println(e);
}
%>