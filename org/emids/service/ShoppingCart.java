package org.emids.service;

import java.util.ArrayList;

import org.emids.Domain.Book;
import org.emids.Domain.Customer;
import org.emids.main.OnlineBookShopMain;

public class ShoppingCart {
	static ArrayList<Book> bookList = new ArrayList<>();
	// Customer customer = new Customer();

	static public void addShopingCart(Book book) {
		bookList.add(book);
	}

	static void showDetailsOfOrder() {
		double total = 0;
		for (int i = 0; i < bookList.size(); i++) {

			System.out.println(bookList.get(i));
			Book bookName = OnlineBookShopMain.bookcontainer.get(i);
			System.out.println(new Customer(1, "Ashwij", "+91-9980351307", "Basavanagudi"));
			total = bookName.getPrice() + total;
		}

		System.out.println("Total bill is " + total + "\n");

	}

	static void shoopingCartDetails() {
		System.out.println("****Book Details****");
		int count = 0;
		for (int i = 0; i < bookList.size(); i++) {
			count++;
			System.out.println(count + " " + bookList.get(i));
		}
	}
	/*
	 * public static void removeBookFromCart(Book book) { bookList.remove(book);
	 * System.out.println("Successfully removed\n");
	 * 
	 * }
	 */

}