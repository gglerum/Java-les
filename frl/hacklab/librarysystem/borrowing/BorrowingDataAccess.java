package frl.hacklab.librarysystem.borrowing;

import frl.hacklab.librarysystem.dao.BorrowingStatusDAO;
import frl.hacklab.librarysystem.item.LibraryItem;

public class BorrowingDataAccess {
    private BorrowingStatusDAO dao;

    public BorrowingDataAccess(BorrowingStatusDAO dao) {
        this.dao = dao;
    }

    public boolean isItemOnLoan(LibraryItem item) {
        return dao.isItemOnLoan(item);
    }

    public void updateBorrowingStatus(LibraryItem item, boolean onLoan) {
        dao.updateBorrowingStatus(item, onLoan);
    }
}