package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import com.dao.EmployeeDAO;
import com.model.Employee;

public class ReportCriteriaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String type = req.getParameter("type");
        String value = req.getParameter("value");

        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = null;

        try {

            if(type.equals("name")){
                list = dao.getByName(value);
            }

            else if(type.equals("years")){
                int years = Integer.parseInt(value);
                list = dao.getByYears(years);
            }

            else if(type.equals("salary")){
                double sal = Double.parseDouble(value);
                list = dao.getBySalary(sal);
            }

            req.setAttribute("data", list);
            RequestDispatcher rd = req.getRequestDispatcher("report_result.jsp");
            rd.forward(req, res);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}