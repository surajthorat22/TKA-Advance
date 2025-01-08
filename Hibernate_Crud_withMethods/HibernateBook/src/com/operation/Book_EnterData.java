package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberBook.BookEntity;

public class Book_EnterData{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(BookEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		System.out.println("Application is Started!!!");
		BookEntity e = new BookEntity();
		
		System.out.println("Enter id :");
		e.setid(sc.nextInt());
		System.out.println("Enter Title :");
		e.setAuthor(sc.next());
		System.out.println("Enter Author name :");
		e.setTitle(sc.next());
		System.out.println("Enter Price :");
		e.setPrice(sc.nextInt());
		System.out.println("Enter Quntity of book :");
		e.setQuantity(sc.nextInt());
		
		ss.persist(e);
		System.out.println(e);
	}

}
