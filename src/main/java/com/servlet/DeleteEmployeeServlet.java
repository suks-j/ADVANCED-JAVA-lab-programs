package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.EmployeeDAO;

public class DeleteEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int empno = Integer.parseInt(req.getParameter("empno"));

            EmployeeDAO dao = new EmployeeDAO();
            boolean status = dao.deleteEmployee(empno);

            if(status)
                res.getWriter().println("Employee Deleted Successfully");
            else
                res.getWriter().println("Delete Failed");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}