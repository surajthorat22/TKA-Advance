package com.HiberStudent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_Entity {


		// Private Fields

		@Id
		private int id;
		private String name;
		private String division;
		private int rollno;

		// Getter & Setter for fields

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getdivision() {
			return division;
		}

		public void setdivision(String division) {
			this.division = division;
		}

		public int getrollno() {
			return rollno;
		}

		public void setrollno(int rollno) {
			this.rollno = rollno;
		}

		// Default Constructor

		public Student_Entity() {

		}

		// Arg-Constructor

		public Student_Entity(int id, String name, String division, int rollno) {
			super();
			this.id = id;
			this.name = name;
			this.division = division;
			this.rollno = rollno;
		}
	

		// toString method

		@Override
		public String toString() {
			return "Student_Entity [id=" + id + ", name=" + name + ", division=" + division + ", rollno=" + rollno
					+ "]";
		}


	}

