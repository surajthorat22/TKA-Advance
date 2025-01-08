package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DemoHiberEmployee.EmployeeEntity;

public class Employee_delete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		System.out.println("Enter Id to remove:");
		int Empid = sc.nextInt();
		EmployeeEntity ed = ss.get(EmployeeEntity.class,Empid);
		
		ss.remove(ed);
		tr.commit();
	}
	
}
