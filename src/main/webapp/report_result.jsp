<%@ page import="java.util.*,com.model.Employee" %>

<h2>Report Results</h2>

<%
List<Employee> list = (List<Employee>) request.getAttribute("data");

if(list != null){
    for(Employee e : list){
%>

EmpNo: <%= e.getEmpno() %> |
Name: <%= e.getEmpName() %> |
Salary: <%= e.getSalary() %>
<br>

<%
    }
} else {
%>

No Data Found

<%
}
%>