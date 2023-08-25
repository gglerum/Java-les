interface BorrowingStatusDAO {
        boolean isItemOnLoan(LibraryItem item);
            void updateBorrowingStatus(LibraryItem item, boolean onLoan);
            }

            class DatabaseBorrowingStatusDAO implements BorrowingStatusDAO {
                // Implement methods using database interactions
                }

                class MockBorrowingStatusDAO implements BorrowingStatusDAO {
                    // Implement methods using mock data (for testing, etc.)
                    }

                    class BorrowingDataAccess {
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
                                                                        
}