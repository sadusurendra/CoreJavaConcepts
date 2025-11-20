package com.zillion.datatypes;

public class C4_DiiferenceofLoops {

	public static void main(String[] args) {

		int i = 0;
		while (i < 0) { // Condition is false initially
			System.out.println("This will never print."); // this code will not execute
			i++;
		}
		System.out.println("After while loop: " + i);

		int j = 0;
		do {
			System.out.println("This will print at least once."); // Prints once
			j++;
		} while (j < 0); // Condition is false after first execution
		System.out.println("After do-while loop: " + j);

	}

}
