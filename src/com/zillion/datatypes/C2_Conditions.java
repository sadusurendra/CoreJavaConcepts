package com.zillion.datatypes;

public class C2_Conditions {

	// Link for reference -> https://www.geeksforgeeks.org/java/decision-making-javaif-else-switch-break-continue-jump/
	// Nested If and Switch Differences -> https://www.google.com/search?q=difference+between+switch+and+else+if+ladder+java&sca_esv=100be553d7950a9c&sxsrf=AE3TifOqx1mxaHl72ti1lCeu_3uq04btPw%3A1763636823323&source=hp&ei=V_YeacyTEbmRseMPoJinmQ8&iflsig=AOw8s4IAAAAAaR8EZymMywQTMqWAoeMug7-Mm4iOgzTo&ved=0ahUKEwiMm_WSy4CRAxW5SGwGHSDMKfMQ4dUDCBk&uact=5&oq=difference+between+switch+and+else+if+ladder+java&gs_lp=Egdnd3Mtd2l6IjFkaWZmZXJlbmNlIGJldHdlZW4gc3dpdGNoIGFuZCBlbHNlIGlmIGxhZGRlciBqYXZhMgYQABgWGB4yCxAAGIAEGIYDGIoFMgsQABiABBiGAxiKBTILEAAYgAQYhgMYigUyBRAAGO8FMgUQABjvBUieggFQAFjZf3ADeACQAQCYAYcCoAHAKKoBBjAuMzkuMbgBA8gBAPgBAZgCK6AC4inCAgoQABiABBhDGIoFwgIOEAAYgAQYsQMYgwEYigXCAgUQABiABMICChAjGIAEGCcYigXCAgsQABiABBiRAhiKBcICCxAAGIAEGLEDGIMBwgIKEAAYgAQYFBiHAsICBxAjGLECGCfCAgcQABiABBgKwgIPEAAYgAQYsQMYgwEYChgLwgIJEAAYgAQYChgLwgIMEAAYgAQYsQMYChgLwgIKEAAYgAQYsQMYDcICBxAAGIAEGA3CAhAQABiABBixAxiDARiKBRgNwgINEAAYgAQYsQMYigUYDcICBxAjGLACGCfCAg0QABiABBixAxiDARgNwgIJEAAYgAQYChgNwgIHEC4YgAQYDcICBhAAGA0YHsICCBAAGBYYChgewgIHECEYoAEYCpgDAJIHBjMuMzkuMaAHvuQCsgcGMC4zOS4xuAfXKcIHBjAuMzcuNsgHZA&sclient=gws-wiz
	public static void main(String[] args) {
		// To verify two values are same or not

		int a = 10;
		int b = 10;

		if (a == b) {
			System.out.println("Both are similar");
		} else {
			System.out.println("Both are not similar");
		}

//				== (Equal to)		
//				!= (Not equal to)
//				> (Greater than)
//				< (Less than)
//				>= (Greater than or equal to)
//				<= (Less than or equal to)

		int a1 = 10;
		int b1 = 100;

		if (a1 > b1) {
			System.out.println("a1 is greater");
		} else {
			System.out.println("b1 is greater");
		}

		int a2 = 10;
		int b2 = 100;
		int c2 = 200;

		if (a2 < b2 && a2 < c2) {
			System.out.println("a1 is smaller");
		} else {
			System.out.println("a2 is not smaller");
		}

//		&& (Logical AND)
//		|| (Logical OR)
//		! (Logical NOT)

		String fruit = "Grape";

		switch (fruit) {
		case "Apple":
			System.out.println("Apple is in red color");
			break;
		case "Orange":
			System.out.println("Orange is in Ornage color");
			break;
		case "Grape":
			System.out.println("Grape is in black color");
			break;
		default:
			System.out.println("No fruit");
		}
		
		
		if(fruit == "Apple") {
			System.out.println("Apple is in red color");
		} else if(fruit == "Orange") {
			System.out.println("Orange is in Ornage color");
		} else if(fruit == "Grape") {
			System.out.println("Grape is in black color");
		} else {
			System.out.println("No fruit");
		}
 
	}

}
