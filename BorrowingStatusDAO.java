interface BorrowingStatusDAO {
    boolean isItemOnLoan(LibraryItem item);

    void updateBorrowingStatus(LibraryItem item, boolean onLoan);
}
