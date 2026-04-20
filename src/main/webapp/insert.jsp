<%@ page import="java.sql.*" %>

<%
int empno = Integer.parseInt(request.getParameter("empno"));
String name = request.getParameter("empname");
int salary = Integer.parseInt(request.getParameter("salary"));

Connection con = null;
PreparedStatement ps = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee","root","root");

    String query = "INSERT INTO Emp VALUES (?, ?, ?)";
    ps = con.prepareStatement(query);

    ps.setInt(1, empno);
    ps.setString(2, name);
    ps.setInt(3, salary);

    ps.executeUpdate();

    out.println("Employee Added Successfully! <br>");
    out.println("<a href='index.jsp'>Add More</a>");

} catch(Exception e) {
    out.println(e);
}
%>