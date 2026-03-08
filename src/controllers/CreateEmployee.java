package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import database.Database;

// Class implementing Option interface
public class CreateEmployee implements Option {

    Scanner scanner = new Scanner(System.in);

    // Create employee
    @Override
    public void create() {

        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Employee Password: ");
        String password = scanner.nextLine();

        try {
            Connection conn = Database.connect();

            String query = "INSERT INTO employees (id, name, email, password) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);

            ps.executeUpdate();

            System.out.println("Employee Created Successfully!");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read employees
    @Override
    public void read() {
        System.out.println("Read employee data functionality.");
    }

    // Update employee
    @Override
    public void update() {
        System.out.println("Update employee functionality.");
    }

    // Delete employee
    @Override
    public void delete() {
        System.out.println("Delete employee functionality.");
    }
}
