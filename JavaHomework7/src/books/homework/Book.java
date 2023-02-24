package books.homework;

public class Book {

	private String name;
	private String author;
	private int numberOfPages;

	public Book(String name, String author, int numberOfPages) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
