import frl.hacklab.librarysystem.LibraryItem;

interface BorrowingStatusDAO {
    boolean isItemOnLoan(LibraryItem item);

    void updateBorrowingStatus(LibraryItem item, boolean onLoan);
}
