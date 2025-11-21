package com.zillion.oopsConcepts.polymorphism;

public class PolymorphismDemo {

//	Polymorphism - "Many forms." It allows objects of different classes to be treated as objects of a common type. This is achieved through method overloading (same method name, different parameters) and method overriding (subclass provides specific implementation of a superclass method).
	
	public static void main(String[] args) {

	
//		Method Overloading (Compile-time Polymorphism):

		MathsFunctionsOld mo = new MathsFunctionsOld();
		System.out.println(mo.sum(10, 20));

		System.out.println(mo.sum(110.50, 20));
		
		System.out.println(mo.sum("Sadhu ","Surendra"));

//		Method Overriding (Runtime Polymorphism).

		MathsFunctionsNew mn = new MathsFunctionsNew();
		
		System.out.println(mn.simpleinterest(100, 5));
		
		System.out.println(mo.simpleinterest(100, 5));

	}

}
