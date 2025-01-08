package com.operation;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberCustomer.CustomerEntity;

public class Customer_Update {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(CustomerEntity.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			System.out.println("Enter Id to remove:");
			int Empid = sc.nextInt();
			CustomerEntity e = ss.get(CustomerEntity.class,Empid);
			
			e.setName("Tanvi");
			e.setEmail("sp@gmail.com");
			
			ss.update(e);
			ss.merge(e);
			
			System.out.println("Data updated Succesfully!!!");
			
			tr.commit();
			ss.close();
		
	}
}
