package com.zillion.oopsConcepts.polymorphism;

public class MathsFunctionsOld {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b;
	}
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	public float sum(float a, float b) {
		return a + b;
	}
	
	public String sum(String a, String b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int simpleinterest(int principal, int timePeriod) {
		return (principal * timePeriod * 12) / 100;
	}
}
