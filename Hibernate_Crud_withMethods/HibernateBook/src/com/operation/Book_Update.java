package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberBook.BookEntity;

public class Book_Update {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(BookEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		System.out.println("Enter Id to remove:");
		int id = sc.nextInt();
		BookEntity e = ss.get(BookEntity.class,id);
		
		e.setAuthor("Swastik");
		e.setPrice(100);
		
		ss.update(e);
		ss.merge(e);
		
		System.out.println("Data updated Succesfully!!!");
		
		tr.commit();
		ss.close();
		
		
		
		
	
	}
}
