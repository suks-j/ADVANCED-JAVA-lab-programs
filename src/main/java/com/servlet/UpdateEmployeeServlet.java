package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.EmployeeDAO;

public class UpdateEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int empno = Integer.parseInt(req.getParameter("empno"));
            double salary = Double.parseDouble(req.getParameter("salary"));

            EmployeeDAO dao = new EmployeeDAO();
            boolean status = dao.updateEmployee(empno, salary);

            if(status)
                res.getWriter().println("Employee Updated Successfully");
            else
                res.getWriter().println("Update Failed");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}