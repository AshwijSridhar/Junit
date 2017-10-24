package org.emids.service;

import java.util.Scanner;

public class Payment {
	static Scanner scanner = new Scanner(System.in);
	public static int value;

	public static int makePayment() {
		System.out.println("Slect payment Option \n Press 1 For COD \n Press 2 for Net Banking \n Press 3 to Cancel");
		 value = scanner.nextInt();
		if (value == 1 || value == 2) {
			System.out.println("Thanks for Shopping");
		} else if (value == 3)
			System.err.println("PAYMENT CANCELLED");
		else {
			System.out.println("Wrong Input");
			makePayment();
		}
		return value;
		
	}
	
	
}