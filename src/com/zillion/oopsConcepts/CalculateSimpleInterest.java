package com.zillion.oopsConcepts;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		int p = 10000;
		int r = 12;
		int t = 3;
		
		int si = (p*r*t)/100;
		
		System.out.println(si);
		
		
		System.out.println(MathsFunctions.simpleinterest(20000,4));
	}

}
