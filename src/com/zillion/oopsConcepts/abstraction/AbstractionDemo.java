package com.zillion.oopsConcepts.abstraction;

public class AbstractionDemo {

	// Abstraction - Showing only essential information to the user and hiding the complex implementation details. This is achieved using abstract classes and interfaces.

	public static void main(String[] args) {

		Bank b1 = new ATMWithdraw();
		b1.checkBalance();
		b1.withdraw();

		Bank b2 = new ChequeWithdraw();
		b2.checkBalance();
		b2.withdraw();
		
	}

}
