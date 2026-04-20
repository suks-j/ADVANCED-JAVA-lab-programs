package com.delete;
import java.sql.*;

public class CoffeeDelete {

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

            // 4. Show existing records
            System.out.println("Existing Coffee Records:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getFloat("price")
                );
            }

            // 5. Delete record (id = 2)
            String deleteQuery = "DELETE FROM coffee WHERE id = 2";
            int rows = stmt.executeUpdate(deleteQuery);

            if (rows > 0) {
                System.out.println("\nCoffee record deleted successfully!");
            } else {
                System.out.println("\nNo record found with given ID.");
            }

            // 6. Show updated records
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