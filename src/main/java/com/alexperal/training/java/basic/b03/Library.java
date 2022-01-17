package com.alexperal.training.java.basic.b03;

public class Library {

	BookShelf shelf1;
	BookShelf shelf2;
	BookShelf shelf3;

	static class BookShelf{
		int books;
		String topic;
	}
	public static void main(String[] args) {
		// We have a library with 3 shelves
		// A shelf have a number of books
		// A shelf has topic like "Adventure"
		// You can borrow a book from a shelf so the number of books is reduced by one

		// Create a library, with 100 books on each shelf, the topics of each one are,
		// Adventure, NonFiction, Crime
		// Borrow 10 books for each one
		// Print the current status of the library
		// You must call library.status()
		// The output should be
		// Bookshelf 1, Topic: Adventure, Books: 90
		// Bookshelf 2, Topic: NonFiction, Books: 90
		// Bookshelf 3, Topic: Crime, Books: 90

		// Tips on how to handle problems that involve objects
		// First, Identify classes (a class is a collection of properties) it is always a noun
		// Second, Identify methods (a method is an action you perform on an object) it is always a verb

		// Bonus question, how would you handle a library with Any amount of shelves
	}
}
