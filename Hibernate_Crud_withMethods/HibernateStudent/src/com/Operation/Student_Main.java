package com.Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberStudent.Student_Entity;


public class Student_Main {

	
	public static void main(String[] args) {
				 
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student_Entity.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			Student_Entity e = new Student_Entity();
			System.out.println("Application is Started!!!");

//			e.setId(0);
			}
	}
