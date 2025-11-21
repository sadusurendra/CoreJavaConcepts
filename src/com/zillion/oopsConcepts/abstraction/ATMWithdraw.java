package com.zillion.oopsConcepts.abstraction;

public class ATMWithdraw extends Bank {

	@Override
	void withdraw() {
		// Code
		System.out.println("ATM withdraw charges are 10 rupees per transcation");
	}

}
