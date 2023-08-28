package frl.hacklab.librarysystem.dao;

import frl.hacklab.librarysystem.item.LibraryItem;

public interface BorrowingStatusDAO {
    boolean isItemOnLoan(LibraryItem item);

    void updateBorrowingStatus(LibraryItem item, boolean onLoan);
}
