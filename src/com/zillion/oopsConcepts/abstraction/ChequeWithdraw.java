package com.zillion.oopsConcepts.abstraction;

public class ChequeWithdraw extends Bank {

	@Override
	void withdraw() {
		System.out.println("Cheque withdraw charges are 15 rupees per transcation");

	}

}
