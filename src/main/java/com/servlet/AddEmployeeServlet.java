package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.EmployeeDAO;
import com.model.Employee;

public class AddEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int empno = Integer.parseInt(req.getParameter("empno"));
            String name = req.getParameter("empname");
            String doj = req.getParameter("doj");
            String gender = req.getParameter("gender");
            double salary = Double.parseDouble(req.getParameter("salary"));

            Employee e = new Employee();
            e.setEmpno(empno);
            e.setEmpName(name);
            e.setDoj(doj);
            e.setGender(gender);
            e.setSalary(salary);

            EmployeeDAO dao = new EmployeeDAO();
            boolean status = dao.addEmployee(e);

            if (status)
                res.sendRedirect("index.jsp");
            else
                res.getWriter().println("Insert Failed");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}