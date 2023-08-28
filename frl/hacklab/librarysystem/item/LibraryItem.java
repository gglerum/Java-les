package frl.hacklab.librarysystem.item;

import frl.hacklab.librarysystem.display.Displayable;
import frl.hacklab.librarysystem.display.LibraryItemDetails;
import frl.hacklab.librarysystem.borrowing.LibraryItemBorrowing;

public class LibraryItem implements Displayable {
    private LibraryItemDetails details;
    private LibraryItemBorrowing borrowing;

    public LibraryItem(String ean, String title, String author, int year) {
        this.details = new LibraryItemDetails(ean, title, author, year);
        this.borrowing = new LibraryItemBorrowing();
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
}