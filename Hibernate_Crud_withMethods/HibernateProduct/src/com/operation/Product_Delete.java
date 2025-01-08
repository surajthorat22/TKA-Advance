package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberProduct.ProductEntity;

public class Product_Delete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		System.out.println("Enter Id to remove:");
		int id = sc.nextInt();
		ProductEntity ed = ss.get(ProductEntity.class,id);
		
		ss.remove(ed);
		tr.commit();
	}
	
}
