package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HiberProduct.ProductEntity;


public class Product_Main {

	public static void main(String[] args) {
			 
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(ProductEntity.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			ProductEntity e = new ProductEntity();
			System.out.println("Application is Started!!!");

			}
	}
	