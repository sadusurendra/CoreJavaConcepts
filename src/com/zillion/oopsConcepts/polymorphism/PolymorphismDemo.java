package com.zillion.oopsConcepts.polymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {

		MathsFunctionsOld mo = new MathsFunctionsOld();
		System.out.println(mo.sum(10, 20));

		System.out.println(mo.sum(110.50, 20));
		
		System.out.println(mo.sum("Sadhu ","Surendra"));
		
		MathsFunctionsNew mn = new MathsFunctionsNew();
		
		System.out.println(mn.simpleinterest(100, 5));
		
		System.out.println(mo.simpleinterest(100, 5));

	}

}
