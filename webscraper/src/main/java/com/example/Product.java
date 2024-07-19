package com.example;

public class Product {
    private String name;
    private String price;
    private String description;
    private String stock;

    // Constructors
    public Product() {
    }

    public Product(String name, String price, String description, String stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
