package model;

import java.util.ArrayList;

public class Section {
    private int id;
    private ArrayList<Product> products;
    private String name;
    private String description;

    // Constructor (parameterized)
    public Section(int id, ArrayList<Product> products, String name, String description) {
        this.id = id;
        this.products = products != null ? products : new ArrayList<>(); // avoid null
        this.name = name;
        this.description = description;
    }

    // Default constructor (optional but useful)
    public Section() {
        this.products = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to add a product into the section
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    // Method to remove a product by ID
    public void removeProductById(int productId) {
        products.removeIf(p -> p.getId() == productId);
    }


}
