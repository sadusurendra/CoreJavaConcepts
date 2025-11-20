package com.zillion.datatypes;

public class C3_Loops {

	
	// Link for reference -> https://www.geeksforgeeks.org/java/loops-in-java/
	
	public static void main(String[] args) {
		// Loops: 3 different loops
		// 1. Do - while
		// 2. While
		// 3. for
		
		// To iterate on data
		
		// Print 1 - 5 values
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		
		
		// 1. Do - while
		
		System.out.println("Do - while Starts");
		
		int a = 1;
		
		do {
			// code
			
			System.out.println(a);
			a = a+1;

		} while(a<=5); // condition -- used to stop the loop
		
		System.out.println("Do - while Ends");
		
		
		// 2. While
		
		System.out.println("While Starts");
		
		int b = 1;
		
		while(b<=5) {
			// code
			System.out.println(b);
			b++; //b+=1; // b = b+1;
		}
		
		System.out.println("While Ends");
		
		// 3. for 
		
		System.out.println("For Loop starts ");
		
		//for(declare/initiate variable; condition; variables updation ) {
			
		for(int c = 1; c <= 5; c++) {
			// code
			System.out.println(c);
		}
		
		System.out.println("For Loop Ends");
		
	}

}
