package frl.hacklab.librarysystem.item;

/**
 * Contains all the methods and aditional fields for books
 */
public class Book extends LibraryItem {
	/**
	 * @param ean    for the book
	 * @param title  of the book
	 * @param author of the book
	 * @param year   of publication
	 */
	public Book(String ean, String title, String author, int year) {
		super(ean, title, author, year);
	}
}