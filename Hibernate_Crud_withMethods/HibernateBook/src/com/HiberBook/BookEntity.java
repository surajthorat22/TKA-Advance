package com.HiberBook;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {

	    @Id
	    private int id; 
	    private String title;
	    private String author;
	    private double price;
	    private int quantity;

	    // Default Constructor
	    
	    public BookEntity() {
	    	
	    }

	    // Parameterized Constructor
	    
	    public BookEntity(int id, String title, String author, double price, int quantity) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getters and Setters
	    
	    public int getid() {
	        return id;
	    }

	    public void setid(int id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
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
	        return "BookEntity [id=" + id + ", title=" + title + ", author=" + author +
	               ", price=" + price + ", quantity=" + quantity + "]";
	    }
	}

