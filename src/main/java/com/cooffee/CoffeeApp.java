package com.cooffee;
import java.sql.*;

public class CoffeeApp {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root"; // change if needed

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Read existing records
            System.out.println("Existing Coffee Records:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getFloat("price")
                );
            }

            // 5. Insert new record
            String insertQuery = "INSERT INTO coffee VALUES (3, 'Cappuccino', 120.5)";
            int rows = stmt.executeUpdate(insertQuery);

            if (rows > 0) {
                System.out.println("\nNew coffee product inserted successfully!");
            }

            // 6. Display updated records
            System.out.println("\nUpdated Coffee Records:");
            rs = stmt.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getFloat("price")
                );
            }

            // 7. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}