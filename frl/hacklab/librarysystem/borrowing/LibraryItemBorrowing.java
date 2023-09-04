package frl.hacklab.librarysystem.borrowing;

import frl.hacklab.librarysystem.item.LibraryItem;

public class LibraryItemBorrowing {
    private boolean onLoan;

    private LibraryItem item;

    public LibraryItemBorrowing(LibraryItem item) {
        this.item = item;
    }

    public boolean isOnLoan() {
        return item.getBorrowingDataAccess().isItemOnLoan();
    }

    public void borrow() {
        if (!this.isOnLoan()) {
            item.getBorrowingDataAccess().updateBorrowingStatus(true);
            System.out.println("Item has been borrowed.");
        } else {
            System.out.println("Item is already on loan.");
        }
    }

    public void returnItem() {
        if (onLoan) {
            onLoan = false;
            System.out.println("Item has been returned.");
        } else {
            System.out.println("Item was not on loan.");
        }
    }
}