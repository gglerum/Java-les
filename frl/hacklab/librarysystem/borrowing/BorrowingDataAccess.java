package frl.hacklab.librarysystem.borrowing;

import frl.hacklab.librarysystem.dao.BorrowingStatusDAO;
import frl.hacklab.librarysystem.item.LibraryItem;

public class BorrowingDataAccess {
    private final BorrowingStatusDAO dao;
    private LibraryItem item;

    public BorrowingDataAccess(BorrowingStatusDAO dao) {
        this.dao = dao;
    }

    public boolean isItemOnLoan() {
        return dao.isItemOnLoan(this.item);
    }

    public void updateBorrowingStatus(boolean onLoan) {
        dao.updateBorrowingStatus(this.item, onLoan);
    }

    public void setLibraryItem(LibraryItem item) {
        this.item = item;
    }
}