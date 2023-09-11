package frl.hacklab.librarysystem.dao;

import frl.hacklab.librarysystem.item.LibraryItem;
import java.util.HashMap;
import java.util.Map;

/**
 * Mock Borrowing Data for testing purposes
 */
public class MockBorrowingStatusDAO implements BorrowingStatusDAO {

  private final Map<String, Boolean> mockItems = new HashMap<>();

  /**
   * Add the mock borrowing data for testing
   */
  public MockBorrowingStatusDAO() {
    mockItems.put("1234567", false);
    mockItems.put("2345678", true);
    mockItems.put("3456789", false);
  }

  @Override
  public boolean isItemOnLoan(LibraryItem item) {
    try {
      return mockItems.get(item.getEan());
    } catch (NullPointerException e) {
      //if the item can't be found notify system and assume it's on loan.
      //TODO notify system that this library item is not in the borrowing data
      return true;
    }
  }

  @Override
  public void setBookBorrowingStatusToOnLoan(LibraryItem item) {
    updateBorrowingStatus(item, true);
  }

  @Override
  public void setBookBorrowingStatusToAvailable(LibraryItem item) {
    updateBorrowingStatus(item, false);
  }

  /**
   * Update the library item in our mock data
   *
   * @param item   that the mock borrowing status will be updated for
   * @param onLoan true if the item needs to be set to loaned, false if the item is available
   */
  private void updateBorrowingStatus(LibraryItem item, boolean onLoan) {
    mockItems.replace(item.getEan(), onLoan);
  }
  // Implement methods using mock data (for testing, etc.)
}