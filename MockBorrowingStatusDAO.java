package javales.dao;

class MockBorrowingStatusDAO implements BorrowingStatusDAO {

    @Override
    public boolean isItemOnLoan(LibraryItem item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isItemOnLoan'");
    }

    @Override
    public void updateBorrowingStatus(LibraryItem item, boolean onLoan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBorrowingStatus'");
    }
    // Implement methods using mock data (for testing, etc.)
}