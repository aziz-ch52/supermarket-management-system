package models;

// Cashier class extending Employee class
public class Cashier extends Employee {

    // Constructor
    public Cashier(int id, String name, String email, String password) {
        super(id, name, email, password); // call parent constructor
    }

    // Method to process a sale
    public void processSale(Product product, int quantity) {
        double total = product.getPrice() * quantity;

        System.out.println("Product Sold: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
    }

    // Method to generate receipt
    public void generateReceipt(Product product, int quantity) {
        double total = product.getPrice() * quantity;

        System.out.println("----- Receipt -----");
        System.out.println("Cashier: " + getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("-------------------");
    }

    // Display cashier information
    public void displayCashierInfo() {
        System.out.println("Cashier ID: " + getId());
        System.out.println("Cashier Name: " + getName());
        System.out.println("Cashier Email: " + getEmail());
    }
}