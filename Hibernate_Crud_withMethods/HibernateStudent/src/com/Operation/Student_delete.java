package com.Operation;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberStudent.Student_Entity;

public class Student_delete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student_Entity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		System.out.println("Enter Id to remove:");
		int Empid = sc.nextInt();
		Student_Entity ed = ss.get(Student_Entity.class,Empid);
		
		ss.remove(ed);
		tr.commit();
	}
	
}
