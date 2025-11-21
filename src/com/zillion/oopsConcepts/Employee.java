package com.zillion.oopsConcepts;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee() {
	}

	

//	public Employee(int i, String name, int salary) {
//
//		this.id = i;
//		this.name = name;
//		this.salary = salary;
//
//	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>=1 && id<=1000) {
			this.id = id;
		} else {
			// Exception
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
