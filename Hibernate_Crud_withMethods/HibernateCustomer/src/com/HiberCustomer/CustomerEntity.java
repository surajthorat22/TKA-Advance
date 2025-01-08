package com.HiberCustomer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerEntity {

	
		// Private fields 

	    @Id
	    private int id; 
	    private String name;
	    private String email;
	    private String phoneNumber;

	    // Default Constructor
	    public CustomerEntity() {
	    	
	    }

	    // Parameterized Constructor
	    public CustomerEntity(int id, String name, String email, String phoneNumber) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    // Getters and Setters
	    public int getid() {
	        return id;
	    }

	    public void setid(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    // toString() Method
	    @Override
	    public String toString() {
	        return "CustomerEntity [id=" + id + ", name=" + name +
	               ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	    }
	}

