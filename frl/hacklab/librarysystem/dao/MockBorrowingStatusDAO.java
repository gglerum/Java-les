package frl.hacklab.librarysystem.dao;

import frl.hacklab.librarysystem.item.Book;
import frl.hacklab.librarysystem.item.DVD;
import frl.hacklab.librarysystem.item.LibraryItem;
import frl.hacklab.librarysystem.item.Magazine;

import java.util.*;

public class MockBorrowingStatusDAO implements BorrowingStatusDAO {

    Map<String, Boolean> mockItems = new HashMap<>();

    public MockBorrowingStatusDAO() {
        mockItems.put("1234567", false);
        mockItems.put("2345678", true);
        mockItems.put("3456789", false);
    }

    @Override
    public boolean isItemOnLoan(LibraryItem item) {
        try {
            return mockItems.get(item.getEan());
        } catch (NullPointerException e) {
            //if the item can't be found notify system and assume it's on loan.
            //TODO notify system that this library item is not in the borrowing data
            return true;
        }
    }

    @Override
    public void updateBorrowingStatus(LibraryItem item, boolean onLoan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBorrowingStatus'");
    }
    // Implement methods using mock data (for testing, etc.)
}