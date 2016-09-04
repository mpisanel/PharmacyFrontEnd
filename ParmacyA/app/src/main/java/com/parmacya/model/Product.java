package com.parmacya.model;

/**
 * Created by SONY on 2016-08-23.
 */
public class Product {
    private Long id;
    private String productName;
    private String productDescription;
    private String quantity;
    private double productPrice;

    public Product(String productName, String productDescription, String quantity, double productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public Product(Long id, String productName, String productDescription, String quantity, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public String getProductDescription() { return productDescription; }

    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }

    public double getProductPrice() { return productPrice; }

    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }
}

