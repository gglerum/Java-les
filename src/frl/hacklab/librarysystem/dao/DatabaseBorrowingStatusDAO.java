package frl.hacklab.librarysystem.dao;

import frl.hacklab.librarysystem.item.LibraryItem;

class DatabaseBorrowingStatusDAO implements BorrowingStatusDAO {

	@Override
	public boolean isItemOnLoan(LibraryItem item) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isItemOnLoan'");
	}

	@Override
	public void setBookBorrowingStatusToOnLoan(LibraryItem item) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setBookBorrowingStatusToOnLoan'");
	}

	@Override
	public void setBookBorrowingStatusToAvailable(LibraryItem item) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setBookBorrowingStatusToAvailable'");
	}

	private void updateBorrowingStatus(LibraryItem item, boolean onLoan) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateBorrowingStatus'");
	}
	// Implement methods using database interactions
}