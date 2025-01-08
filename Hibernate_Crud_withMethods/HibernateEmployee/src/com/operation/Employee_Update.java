package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DemoHiberEmployee.EmployeeEntity;

public class Employee_Update {

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
			EmployeeEntity e = ss.get(EmployeeEntity.class,Empid);
			
			e.setName("Pratik");
			e.setSalary(100);
			
			ss.update(e);
			ss.merge(e);
			
			System.out.println("Data updated Succesfully!!!");
			
			tr.commit();
			ss.close();
		
	}
}
