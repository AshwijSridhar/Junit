package org.emids.service;

import java.util.Scanner;

public class CustomerBookShelf {
	Scanner scanner = new Scanner(System.in);

	public void bookShelf() {
		System.out.println("enter the book");
		String options = scanner.nextLine();
		if (options.equalsIgnoreCase("artificial Intelligence")) {
			System.out.println("it is succesfully added to shelf no 1 u can find it later");
		} else if (options.equalsIgnoreCase("Cyber Security")) {
			System.out.println("it is succesfully added to shelf no 2 u can find it later");
		} else if (options.equalsIgnoreCase("data science")) {
			System.out.println("it is succesfully added to shelf no 3 u can find it later");
		}

	}

}