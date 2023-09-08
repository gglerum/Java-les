package frl.hacklab.librarysystem.borrowing;

import frl.hacklab.librarysystem.dao.BorrowingStatusDAO;
import frl.hacklab.librarysystem.item.LibraryItem;

/**
 * Controls access to the Borrowing DAO
 */
public class BorrowingDataAccess {
	private final BorrowingStatusDAO dao;
	private LibraryItem item;

	/**
	 * @param dao the DAO used for the borrowing data
	 */
	public BorrowingDataAccess(BorrowingStatusDAO dao) {
		this.dao = dao;
	}

	/**
	 * @return true if the library item is on loan, false if it's still available
	 */
	public boolean isItemOnLoan() {
		return dao.isItemOnLoan(item);
	}

	/**
	 * updates the borrowing status of the library item to on loan
	 */
	public void setBorrowingStatusToOnLoan() {
		dao.setBookBorrowingStatusToOnLoan(item);
	}

	/**
	 * updates the borrowing status of the library item to available
	 */
	public void setBorrowingStatusToAvailable() {
		dao.setBookBorrowingStatusToAvailable(item);
	}

	/**
	 * @param item Set the library item borrowing information is managed for
	 */
	public void setLibraryItem(LibraryItem item) {
		this.item = item;
	}
}