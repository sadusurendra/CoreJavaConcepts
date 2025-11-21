package com.zillion.oopsConcepts.inheritance;

public class InheritanceDemo {
	
	// Inheritance --> A mechanism where one class (subclass/child class) acquires the properties and behaviors of another class (superclass/parent class). It promotes code reusability and establishes a "is-a" relationship.
	public static void main(String[] args) {
		
		
		// -- Inheritance
		
//		MathsFunctionsOld mo = new MathsFunctionsOld();
		
		MathsFunctionsNew mn = new MathsFunctionsNew();
		
		int a = 10, b =100, c =50;
		
		int sum = mn.sum(a, b);
		int mul = mn.multiply(sum, c);
		
		System.out.println("Result ::"+mul);
		
	}

}
