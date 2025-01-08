package com.operation;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberBook.BookEntity;

public class Book_DeleteData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(BookEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		BookEntity e = new BookEntity();
		System.out.println("Application is Started!!!");
		

		System.out.println("Enter Id to remove:");
		int id = sc.nextInt();
		BookEntity ed = ss.get(BookEntity.class,id);
		
		ss.remove(ed);
		tr.commit();
		
	}
	
}
