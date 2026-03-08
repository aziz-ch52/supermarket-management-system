package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Database class for MySQL connection
public class Database {

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/supermarket";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Method to establish connection
    public static Connection connect() {
        Connection conn = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }

        return conn;
    }

    // Method to close connection
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
