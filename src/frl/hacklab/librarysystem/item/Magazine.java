package frl.hacklab.librarysystem.item;

/**
 * Class for magazines
 */
public class Magazine extends LibraryItem {
	/**
	 * @param ean    of the magazine
	 * @param title  of the magazine
	 * @param author of the magazine
	 * @param year   of publication
	 */
	public Magazine(String ean, String title, String author, int year) {
		super(ean, title, author, year);
	}
}