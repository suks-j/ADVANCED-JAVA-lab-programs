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

    String query = "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?";
    ps = con.prepareStatement(query);

    ps.setString(1, name);
    ps.setInt(2, salary);
    ps.setInt(3, empno);

    int rows = ps.executeUpdate();

    if(rows > 0) {
        out.println("<h3>Employee Updated Successfully!</h3>");
    } else {
        out.println("<h3>No Employee Found with given ID!</h3>");
    }

    out.println("<br><a href='update.jsp'>Go Back</a>");

} catch(Exception e) {
    out.println(e);
}
%>