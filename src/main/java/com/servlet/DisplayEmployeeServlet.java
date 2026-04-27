package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.EmployeeDAO;
import com.model.Employee;

public class DisplayEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int empno = Integer.parseInt(req.getParameter("empno"));

            EmployeeDAO dao = new EmployeeDAO();
            Employee e = dao.getEmployee(empno);

            if(e != null){
                res.getWriter().println("EmpNo: " + e.getEmpno());
                res.getWriter().println("<br>Name: " + e.getEmpName());
                res.getWriter().println("<br>Salary: " + e.getSalary());
            } else {
                res.getWriter().println("Employee Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}