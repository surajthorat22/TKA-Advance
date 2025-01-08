package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberCustomer.CustomerEntity;


public class Customer_delete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CustomerEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		CustomerEntity e = new CustomerEntity();
		System.out.println("Application is Started!!!");
		
		System.out.println("Enter Id to remove:");
		int Empid = sc.nextInt();
		CustomerEntity ed = ss.get(CustomerEntity.class,Empid);
		
		ss.remove(ed);
		tr.commit();
	}
	
}
