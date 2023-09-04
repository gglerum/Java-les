package frl.hacklab.librarysystem;

import frl.hacklab.librarysystem.borrowing.BorrowingDataAccess;
import frl.hacklab.librarysystem.dao.MockBorrowingStatusDAO;
import frl.hacklab.librarysystem.item.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibrarySubsystem librarySubsystem = new LibrarySubsystem();
        List<LibraryItem> libraryItems = new ArrayList<>();
        List<ReferenceItem> referenceItems = new ArrayList<>();

        // Add library items
        libraryItems.add(new Book("1234567","Book Title", "Author", 2023));
        libraryItems.add(new Magazine("2345678", "Magazine Title", "Editor", 2023));
        libraryItems.add(new DVD("3456789", "DVD Title", "Director", 2023));

        // Inject dependencies
        libraryItems.forEach(item -> item.setBorrowingDataAccess(new BorrowingDataAccess(new MockBorrowingStatusDAO())));

        // Add reference items
        referenceItems.add(new Dictionary("English Dictionary", "A comprehensive dictionary."));
        referenceItems.add(new Encyclopedia("World Encyclopedia", "A collection of knowledge on various topics."));

        librarySubsystem.addItems(new ArrayList<>(libraryItems));
        librarySubsystem.addItems(new ArrayList<>(referenceItems));

        // Print details
        librarySubsystem.printAllDetails();
    }
}
