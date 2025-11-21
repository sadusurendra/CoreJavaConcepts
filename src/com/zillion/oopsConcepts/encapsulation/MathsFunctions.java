package com.zillion.oopsConcepts.encapsulation;

public class MathsFunctions {

	public static void main(String[] args) {

		System.out.println(sum(10, 20));

		System.out.println(sum(100, 200));

		System.out.println(sum(-20, 30));

		System.out.println("s1 :: " + simpleinterest(10000, 2));

	}

	public static int sum(int a, int b) {
		// code
		return a + b;
	}

	public static int sub(int a, int b) {
		// code
		return a - b;
	}

	// Principal Amount, Interest rate, Time period
	public static int simpleinterest(int principal, int timePeriod) {
		return (principal * timePeriod * 12) / 100;
	}

	// public --> Access Modifier
	// int --> return type
	// sum --> Name of the function
	// int a, int b --> Input variables
	// return a + b; --> the value which we are returning to parent function.

//	transfering --> UPI, NEFT, CHEQUE, ATM
//	
//	check balance

}
