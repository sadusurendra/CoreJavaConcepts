package com.zillion.oopsConcepts.polymorphism;

public class MathsFunctionsNew extends MathsFunctionsOld {

	public int multiply(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public int simpleinterest(int principal, int timePeriod) {
		return (principal * timePeriod * 15) / 100;
	}

}
