package com.zillion.oopsConcepts;

public class EmployeeDemo {

	public static void main(String[] args) {
//		int id = 1;
//		String name = "XYZ";
//		int salary = 1000;
//
//		System.out.println("Employee 1 :: Id - " + id + ", Name - " + name + ", Salary - " + salary);
//
//		int id1 = 2;
//		String name1 = "ABC";
//		int salary1 = 5000;
//
//		System.out.println("Employee 2 :: Id - " + id1 + ", Name - " + name1 + ", Salary - " + salary1);

		// Static -> We can access the variable/method using class name
		// Non-Static -> We have to create an object to access the variables/methods

//		Employee e1 = new Employee();
//
//		e1.id = 10;
//		e1.name = "XYZ";
//		e1.salary = 600;
//
//		System.out.println("Employee :: Id -  " + e1.id + ", Name - " + e1.name + ", Salary - " + e1.salary);
//
//		Employee e2 = new Employee();
//
//		e2.id = 101;
//		e2.name = "ABC";
//		e2.salary = 7600;

//		System.out.println("Employee :: Id -  " + e2.id + ", Name - " + e2.name + ", Salary - " + e2.salary);

//		Employee e3 = new Employee(11, "ZYX", 500);
//		System.out.println("Employee 3 :: Id -  " + e3.id + ", Name - " + e3.name + ", Salary - " + e3.salary);
//
//		Employee e4 = new Employee(12, "CVB", 600);
//		System.out.println("Employee 4 :: Id -  " + e4.id + ", Name - " + e4.name + ", Salary - " + e4.salary);

		
		
		Employee e5 = new Employee();
		e5.setId(-10);
		e5.setName("adbashbdaldna;fnweefbwf23462394624");
		e5.setSalary(-600);

		System.out.println("Employee 5 :: Id - " + e5.getId()+", Name - "+e5.getName());

	}

}
