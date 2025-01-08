package com.HiberProduct;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	
		// Private fields

	    @Id
	    private int productId; 
	    private String productName;
	    private double price;
	    private int quantity;

	    // Default Constructor
	    
	    public ProductEntity() {
	    	
	    }

	    // Parameterized Constructor
	    
	    public ProductEntity(int productId, String productName, double price, int quantity) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getters and Setters
	    
	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    // toString() Method
	    @Override
	    public String toString() {
	        return "Product [productId=" + productId + ", productName=" + productName +
	               ", price=" + price + ", quantity=" + quantity + "]";
	    }
	}

