package models;

// Admin class extending Employee class
public class Admin extends Employee {

    // Constructor
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password); // calling parent constructor
    }

    // Method to add product
    public void addProduct(Product product) {
        System.out.println("Admin added product: " + product.getName());
    }

    // Method to remove product
    public void removeProduct(Product product) {
        System.out.println("Admin removed product: " + product.getName());
    }

    // Method to update product
    public void updateProduct(Product product) {
        System.out.println("Admin updated product: " + product.getName());
    }

    // Display admin information
    public void displayAdminInfo() {
        System.out.println("Admin ID: " + getId());
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
    }
}