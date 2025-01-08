package com.Operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberStudent.Student_Entity;

public class Student_Update {

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
			Student_Entity e = ss.get(Student_Entity.class,Empid);
			
			e.setName("Pratik");
			e.setdivision("X");
			
			ss.update(e);
			ss.merge(e);
			
			System.out.println("Data updated Succesfully!!!");
			
			tr.commit();
			ss.close();
		
	}
}
