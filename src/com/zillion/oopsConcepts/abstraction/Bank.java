package com.zillion.oopsConcepts.abstraction;

abstract class Bank {

	public void checkBalance() {
		System.out.println("Checking balance.....");
	}

	abstract void withdraw();

}
