package com.insert;
import java.sql.*;

public class InsertEmp {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee","root","root");

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Emp VALUES (?, ?, ?)");

        ps.setInt(1, 101);
        ps.setString(2, "Ramesh");
        ps.setInt(3, 25000);
        ps.executeUpdate();

        ps.setInt(1, 102);
        ps.setString(2, "Ravi");
        ps.setInt(3, 20000);
        ps.executeUpdate();

        ps.setInt(1, 103);
        ps.setString(2, "Suresh");
        ps.setInt(3, 30000);
        ps.executeUpdate();

        ps.setInt(1, 104);
        ps.setString(2, "Anil");
        ps.setInt(3, 15000);
        ps.executeUpdate();

        ps.setInt(1, 105);
        ps.setString(2, "Rohit");
        ps.setInt(3, 18000);
        ps.executeUpdate();

        System.out.println("Records Inserted!");
    }
}