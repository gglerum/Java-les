package frl.hacklab.librarysystem.borrowing;

/**
 * Manage the borrowing of the Library Items
 */
public class LibraryItemBorrowing {

  private BorrowingDataAccess borrowingDataAccess;

  /**
   * Set the borrowing access to the dao
   *
   * @param borrowingDataAccess the access to the dao
   */
  public void setBorrowingDataAccess(BorrowingDataAccess borrowingDataAccess) {
    this.borrowingDataAccess = borrowingDataAccess;
  }

  /**
   * @return data access to borrowing dao
   */
  public BorrowingDataAccess getBorrowingDataAccess() throws NullPointerException {
    if (borrowingDataAccess == null) {
      throw new NullPointerException(
          "BorrowingDataAccess was not injected with setter method (setBorrowingDataAccess)");
    }
    return borrowingDataAccess;
  }

  /**
   * @return true if the library item is on loan, false if the library item is available
   */
  public boolean isOnLoan() {
    return getBorrowingDataAccess().isItemOnLoan();
  }

  /**
   * Borrow the Library Item
   *
   * @return true if the item could be borrowed, false if the item could not be borrowed
   */
  public boolean borrow() {
    if (!isOnLoan()) {
      getBorrowingDataAccess().setBorrowingStatusToOnLoan();
      System.out.println("Item has been borrowed.");
      return true;
    }
    System.out.println("Item is already on loan.");
    return false;
  }

  /**
   * Return the library item
   *
   * @return true if the item could be returned, false if the item could not be returned
   */
  public boolean returnItem() {
    if (isOnLoan()) {
      getBorrowingDataAccess().setBorrowingStatusToAvailable();
      System.out.println("Item has been returned.");
      return true;
    }
    System.out.println("Item was not on loan.");
    return false;
  }
}