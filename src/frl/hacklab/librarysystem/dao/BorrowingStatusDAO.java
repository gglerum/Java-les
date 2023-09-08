package frl.hacklab.librarysystem.dao;

import frl.hacklab.librarysystem.item.LibraryItem;

/**
 * Controls the DAO for the borrowing status
 */
public interface BorrowingStatusDAO {
	/**
	 * Queries the Data Access Object to see if the item is on loan
	 *
	 * @param item that the borrowing status will be checked for
	 * @return true if the item is on loan, false if the item is available
	 */
	boolean isItemOnLoan(LibraryItem item);

	/**
	 * Updates the borrowing status using the Data Access Object
	 *
	 * @param item that the borrowing status will be updated for
	 */
	void setBookBorrowingStatusToOnLoan(LibraryItem item);

	/**
	 * Updates the borrowing status using the Data Access Object
	 *
	 * @param item that the borrowing status will be updated for
	 */
	void setBookBorrowingStatusToAvailable(LibraryItem item);
}
