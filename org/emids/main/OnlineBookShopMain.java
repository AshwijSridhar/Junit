package org.emids.main;

import java.util.ArrayList;

import org.emids.Domain.Book;
import org.emids.service.MainView;

public class OnlineBookShopMain {
	public static ArrayList<Book> bookcontainer = new ArrayList<Book>();

	public static void main(String[] args) {

		Book book1 = new Book("Artificial Intelligence", "Peter Norvig", 1800);
		Book book2 = new Book("Cyber Security", "David Kennedy", 700);
		Book book3 = new Book("Data Science", "Joel Grus", 450);
		Book book4 = new Book("Python", "Net Ninja", 650);
		bookcontainer.add(book1);
		bookcontainer.add(book2);
		bookcontainer.add(book3);
		bookcontainer.add(book4);
		MainView mainview = new MainView();
		mainview.option();
	}
}