package org.emids.Domain;

public class Book {
	private String bookName;
	private String authorName;
	private double price;
	Book bookStore;

	public Book(String bookName, String authorName, double price) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	public Book() {

	}

	public String getBookname() {
		return this.bookName;
	}

	public String getAuthoername() {
		return this.authorName;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authoerName=" + authorName + ", price=" + price + "]";
	}

}
