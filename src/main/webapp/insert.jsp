<%@ page import="java.sql.*" %>

<%
int empno = Integer.parseInt(request.getParameter("empno"));
String name = request.getParameter("empname");
int salary = Integer.parseInt(request.getParameter("salary"));

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/Employee","root","root");

PreparedStatement ps = con.prepareStatement(
    "INSERT INTO Emp VALUES (?, ?, ?)");

ps.setInt(1, empno);
ps.setString(2, name);
ps.setInt(3, salary);

ps.executeUpdate();

out.println("Employee Added Successfully!");
%>