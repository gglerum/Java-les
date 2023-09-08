package frl.hacklab.librarysystem;

import frl.hacklab.librarysystem.borrowing.BorrowingDataAccess;
import frl.hacklab.librarysystem.dao.MockBorrowingStatusDAO;
import frl.hacklab.librarysystem.display.Displayable;
import frl.hacklab.librarysystem.item.Book;
import frl.hacklab.librarysystem.item.DVD;
import frl.hacklab.librarysystem.item.Dictionary;
import frl.hacklab.librarysystem.item.Encyclopedia;
import frl.hacklab.librarysystem.item.LibraryItem;
import frl.hacklab.librarysystem.item.Magazine;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LibrarySubsystemTest {

  final LibrarySubsystem librarySubsystem = new LibrarySubsystem();

  void addItem() {
    Book book = new Book("1234567", "Frisby Island", "Glenn Glerum", 2023);
    book.setBorrowingDataAccess(new BorrowingDataAccess(new MockBorrowingStatusDAO()));
    librarySubsystem.addItem(book);
  }

  void addItems() {
    List<LibraryItem> itemsToAdd = new ArrayList<>(Arrays.asList(
        new Magazine("2345678", "Glenn's Coding Facts", "Glenn Glerum", 2023),
        new DVD("3456789", "Glenn's Naughty Coding Secrets", "Glenn Glerum", 2023)
    ));
    //inject BorrowingDataAccess
    itemsToAdd.forEach(
        item -> item.setBorrowingDataAccess(new BorrowingDataAccess(new MockBorrowingStatusDAO())));

    List<Displayable> referenceItems = new ArrayList<>(Arrays.asList(
        new Encyclopedia("ref01", "Code Smells", "Contains every code smell known to coding kind"),
        new Dictionary("ref02", "Coding Terms", "Contains all terms used during programming")
    ));

    librarySubsystem.addItems(new ArrayList<>(itemsToAdd));
    librarySubsystem.addItems(referenceItems);
  }

  @Test
  void printAllDetails() {
    PrintStream standardOut = System.out;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    //replace out with the stream captor
    System.setOut(new PrintStream(outputStreamCaptor));

    addItem();
    addItems();

    librarySubsystem.printAllDetails();

    Assertions.assertInstanceOf(String.class, outputStreamCaptor.toString());

    //set system out back to what it was
    System.setOut(standardOut);
  }
}