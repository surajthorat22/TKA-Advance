package com.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DemoHiberEmployee.EmployeeEntity;


public class Employee_Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(EmployeeEntity.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	EmployeeEntity e = new EmployeeEntity();
	System.out.println("Application is Started!!!");
	
	System.out.println("Enter id: ");
	e.setId(sc.nextInt());	
	System.out.println("Enter Name: "); 
	e.setName(sc.next());
	System.out.println("Enter Department: "); 
	e.setDepartment(sc.next());	
	System.out.println("Enter Salary: "); 
	e.setSalary(sc.nextInt());	

	ss.persist(e);
	tr.commit();
	
	System.out.println(e);
	

	}
}