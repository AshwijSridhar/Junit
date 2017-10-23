package org.emids.service;

import java.util.Scanner;

public class MainView {
	public static void option() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("WELCOME TO OUR ONLINE BOOKSTORE");
		System.out.println("1 view BOOKS");
		System.out.println("2 search books");
		System.out.println("3 Add Book To Wishlist");
		System.out.println("4 view cart details");
		System.out.println("5 Place Order");
		System.out.println("6 Make Payment");
		System.out.println("7 EXIT");

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(" Enter an option");

		int menu = scanner.nextInt();
		Product prodact = new Product();
		switch (menu) {
		case 1:
			prodact.viewProdact();
			MainView.option();
			break;
		case 2:
			Inventory inventory = new Inventory();
			System.out.println("press 1 for search by bookName or 2 for search by Author name");
			int check = scanner.nextInt();
			if (check == 1) {
				inventory.searchByBookName();

			} else if (check == 2) {
				inventory.searchByAuthoerName();
			}
			MainView.option();

			break;
		case 3:
			CustomerBookShelf customerBookShelf = new CustomerBookShelf();
			customerBookShelf.bookShelf();
			MainView.option();
			break;
		case 4:
			ShoppingCart shoppingCart = new ShoppingCart();
			ShoppingCart.shoopingCartDetails();
			MainView.option();
		case 5:
			Order order = new Order();
			order.orders();
			System.out.println(" press 1 for get order details");
			int value = scanner.nextInt();
			if (value == 1) {
				ShoppingCart.showDetailsOfOrder();

			}

			MainView.option();
			break;
		case 6:
			// Product product = new Product();
			// product.exit();
			Payment.makePayment();
			MainView.option();
			break;

		case 7:
			Product product = new Product();
			product.exit();
			System.exit(0);
		default:
			System.out.println("Please enter correct option");

			break;
		}

	}

}