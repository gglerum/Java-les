package frl.hacklab.librarysystem.item;

/**
 * Class for DVDs
 */
public class DVD extends LibraryItem {
	/**
	 * @param ean    of DVD
	 * @param title  of DVD
	 * @param author of DVD
	 * @param year   of publication
	 */
	public DVD(String ean, String title, String author, int year) {
		super(ean, title, author, year);
	}
}