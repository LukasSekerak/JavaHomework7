package homework;

import java.time.LocalDate;

import books.homework.Book;

public class Borrowing {

	private Book boorrowedBook;
	private Subscriber subscriber;
	private LocalDate dateOfBorrowing;
	private LocalDate returnDate;

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public Borrowing(Book boorrowedBook, Subscriber subscriber, LocalDate dateOfBorrowing) {
		this.boorrowedBook = boorrowedBook;
		this.subscriber = subscriber;
		this.dateOfBorrowing = dateOfBorrowing;
	}

	public Borrowing(Book boorrowedBook, Subscriber subscriber, LocalDate dateOfBorrowing, LocalDate returnDate) {
		this(boorrowedBook, subscriber, dateOfBorrowing);
		this.returnDate = returnDate;
	}

}
