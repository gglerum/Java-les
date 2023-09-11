package frl.hacklab.librarysystem.item;

import frl.hacklab.librarysystem.borrowing.BorrowingDataAccess;
import frl.hacklab.librarysystem.borrowing.LibraryItemBorrowing;
import frl.hacklab.librarysystem.display.Displayable;
import frl.hacklab.librarysystem.display.LibraryItemDetails;

/**
 * Abstract class for all Library Items
 */
public class LibraryItem implements Displayable {

  private final LibraryItemDetails details;
  private final LibraryItemBorrowing borrowing;

  /**
   * @param ean    of the Library Item
   * @param title  of the Library Item
   * @param author of the Library Item
   * @param year   of publication
   */
  protected LibraryItem(String ean, String title, String author, int year) {
    details = new LibraryItemDetails(ean, title, author, year);
    borrowing = new LibraryItemBorrowing();
  }

  /**
   * Check if Libary item is on loan
   *
   * @return true if on loan, false if available
   */
  public boolean isOnLoan() {
    return borrowing.isOnLoan();
  }

  /**
   * Prints the details of the library item to the console
   */
  @Override
  public void printDetails() {
    details.printDetails();
    if (borrowing.isOnLoan()) {
      System.out.println("Status: On Loan");
    } else {
      System.out.println("Status: Available");
    }
  }

  /**
   * Borrow the Library Item
   *
   * @return true if Library Item could be borrowed, false if Library Item could not be borrowed
   */
  public boolean borrow() {
    return borrowing.borrow();
  }

  /**
   * Return the Library Item
   *
   * @return true if the Library Item could be returned, false if the Library Item could not be
   * returned
   */
  public boolean returnItem() {
    return borrowing.returnItem();
  }

  /**
   * Set the borrowingDataAccess for the Library Item
   *
   * @param borrowingDataAccess the object we access the DAO through
   */
  public void setBorrowingDataAccess(BorrowingDataAccess borrowingDataAccess) {
    borrowingDataAccess.setLibraryItem(this);
    borrowing.setBorrowingDataAccess(borrowingDataAccess);
  }

  /**
   * @return ean
   */
  public String getEan() {
    return details.ean();
  }
}