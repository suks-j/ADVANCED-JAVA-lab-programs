package com.dao;

import java.sql.*;
import java.util.*;
import com.model.Employee;

public class EmployeeDAO {

    // ✅ DB Connection
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/EmployeeDB", "root", "root");
    }

    // ✅ ADD EMPLOYEE
    public boolean addEmployee(Employee e) {
        try (Connection con = getConnection()) {

            String query = "INSERT INTO Employee VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, e.getEmpno());
            ps.setString(2, e.getEmpName());
            ps.setString(3, e.getDoj());
            ps.setString(4, e.getGender());
            ps.setDouble(5, e.getSalary());

            return ps.executeUpdate() > 0;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // ✅ UPDATE EMPLOYEE (Salary)
    public boolean updateEmployee(int empno, double salary) {
        try (Connection con = getConnection()) {

            String q = "UPDATE Employee SET Bsalary=? WHERE Empno=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setDouble(1, salary);
            ps.setInt(2, empno);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // ✅ DELETE EMPLOYEE
    public boolean deleteEmployee(int empno) {
        try (Connection con = getConnection()) {

            String q = "DELETE FROM Employee WHERE Empno=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, empno);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // ✅ DISPLAY EMPLOYEE
    public Employee getEmployee(int empno) {
        Employee emp = null;

        try (Connection con = getConnection()) {

            String q = "SELECT * FROM Employee WHERE Empno=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, empno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                emp = new Employee();
                emp.setEmpno(rs.getInt(1));
                emp.setEmpName(rs.getString(2));
                emp.setDoj(rs.getString(3));
                emp.setGender(rs.getString(4));
                emp.setSalary(rs.getDouble(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;
    }

    // ✅ REPORT 1: Name starts with letter
    public List<Employee> getByName(String letter) {
        List<Employee> list = new ArrayList<>();

        try (Connection con = getConnection()) {

            String q = "SELECT * FROM Employee WHERE EmpName LIKE ?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, letter + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpno(rs.getInt(1));
                e.setEmpName(rs.getString(2));
                e.setDoj(rs.getString(3));
                e.setGender(rs.getString(4));
                e.setSalary(rs.getDouble(5));
                list.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ REPORT 2: Years of service
    public List<Employee> getByYears(int years) {
        List<Employee> list = new ArrayList<>();

        try (Connection con = getConnection()) {

            String q = "SELECT * FROM Employee WHERE TIMESTAMPDIFF(YEAR, DoJ, CURDATE()) >= ?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, years);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpno(rs.getInt(1));
                e.setEmpName(rs.getString(2));
                e.setDoj(rs.getString(3));
                e.setGender(rs.getString(4));
                e.setSalary(rs.getDouble(5));
                list.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ REPORT 3: Salary greater than value
    public List<Employee> getBySalary(double sal) {
        List<Employee> list = new ArrayList<>();

        try (Connection con = getConnection()) {

            String q = "SELECT * FROM Employee WHERE Bsalary > ?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setDouble(1, sal);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmpno(rs.getInt(1));
                e.setEmpName(rs.getString(2));
                e.setDoj(rs.getString(3));
                e.setGender(rs.getString(4));
                e.setSalary(rs.getDouble(5));
                list.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}