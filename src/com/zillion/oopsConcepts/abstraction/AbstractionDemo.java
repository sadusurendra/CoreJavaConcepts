package com.zillion.oopsConcepts.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {

		Bank b1 = new ATMWithdraw();
		b1.checkBalance();
		b1.withdraw();

		Bank b2 = new ChequeWithdraw();
		b2.checkBalance();
		b2.withdraw();

	}

}
