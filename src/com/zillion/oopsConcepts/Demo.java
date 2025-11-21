package com.zillion.oopsConcepts;

public class Demo {

	public static void main(String[] args) {
		// Addition, subtraction, multiplication, division, Simple Interest

		int a = 100;
		int b = 20;

		int sum = a + b;
		System.out.println("Sum :: " + sum);

		int x = 20;
		int y = 50;

		int sumxy = x + y;
		System.out.println("SUm of x,y :: " + sumxy);
		
		System.out.println(MathsFunctions.simpleinterest(300, 5));
		

	}

}
