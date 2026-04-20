package com.query;
import java.sql.*;

public class CoffeeQueryD {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root"; // change if needed

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Display all records
            System.out.println("Existing Coffee Records:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getFloat("price")
                );
            }

            // 5. Query coffee names starting with 'D'
            System.out.println("\nCoffee Names starting with 'D':");

            rs = stmt.executeQuery(
                "SELECT * FROM coffee WHERE name LIKE 'D%'"
            );

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getFloat("price")
                );
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}