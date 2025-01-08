package com.DemoHiberEmployee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table("Employee_Table")
public class EmployeeEntity {

	// Private Fields

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String department;
	private int salary;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Default Constructor

	public EmployeeEntity() {

	}

	// Arg-Constructor

	public EmployeeEntity(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// toString method

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}

}
