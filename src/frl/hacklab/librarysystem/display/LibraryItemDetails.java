package frl.hacklab.librarysystem.display;

/**
 * @param ean    of the Library Item
 * @param title  of the Library Item
 * @param author of the Library Item
 * @param year   of publication
 */
public record LibraryItemDetails(String ean, String title, String author, int year) implements
    Displayable {

  @Override
  public void printDetails() {
    System.out.println("EAN:" + ean);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Year: " + year);
  }
}