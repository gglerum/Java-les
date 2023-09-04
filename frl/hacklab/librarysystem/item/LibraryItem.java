package frl.hacklab.librarysystem.item;

import frl.hacklab.librarysystem.borrowing.BorrowingDataAccess;
import frl.hacklab.librarysystem.display.Displayable;
import frl.hacklab.librarysystem.display.LibraryItemDetails;
import frl.hacklab.librarysystem.borrowing.LibraryItemBorrowing;

public class LibraryItem implements Displayable {
    private final LibraryItemDetails details;
    private final LibraryItemBorrowing borrowing;
    private BorrowingDataAccess borrowingDataAccess;

    public LibraryItem(String ean, String title, String author, int year) {
        this.details = new LibraryItemDetails(ean, title, author, year);
        this.borrowing = new LibraryItemBorrowing(this);
    }

    @Override
    public void printDetails() {
        details.printDetails();
        if (borrowing.isOnLoan()) {
            System.out.println("Status: On Loan");
        } else {
            System.out.println("Status: Available");
        }
    }

    public void borrow() {
        borrowing.borrow();
    }

    public void returnItem() {
        borrowing.returnItem();
    }

    public void setBorrowingDataAccess(BorrowingDataAccess borrowingDataAccess) {
        borrowingDataAccess.setLibraryItem(this);
        this.borrowingDataAccess = borrowingDataAccess;
    }

    public BorrowingDataAccess getBorrowingDataAccess() {
        return this.borrowingDataAccess;
    }

    public String getEan() {
        return this.details.ean();
    }
}