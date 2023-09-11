package frl.hacklab.librarysystem;

import frl.hacklab.librarysystem.borrowing.BorrowingDataAccess;
import frl.hacklab.librarysystem.dao.MockBorrowingStatusDAO;
import frl.hacklab.librarysystem.item.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookTest {

  static BorrowingDataAccess borrowingDataAccess;

  @BeforeAll
  static void beforeAll() {
    borrowingDataAccess = new BorrowingDataAccess(new MockBorrowingStatusDAO());
  }

  @Test
  @Order(1)
  void printDetails() {
    Book book = new Book("1234567", "Frisby Island", "Glenn Glerum", 2023);
    book.setBorrowingDataAccess(borrowingDataAccess);
    book.printDetails();
  }

  @Test
  @Order(2)
  void borrow() {
    Book book = new Book("1234567", "Frisby Island", "Glenn Glerum", 2023);
    book.setBorrowingDataAccess(borrowingDataAccess);

    //book is still available
    Assertions.assertTrue(book.borrow());
    //book is unavailable
    Assertions.assertFalse(book.borrow());

    //print details with changed loan status
    book.printDetails();
  }

  @Test
  @Order(3)
  void returnItem() {
    Book book = new Book("1234567", "Frisby Island", "Glenn Glerum", 2023);
    book.setBorrowingDataAccess(borrowingDataAccess);

    //assume that book has been borrowed
    Assumptions.assumeTrue(book.isOnLoan());

    //book has been borrowed by previous test, return it
    Assertions.assertTrue(book.returnItem());

    //book can no longer be returned as it has already been returned
    Assumptions.assumeFalse(book.isOnLoan());
    Assertions.assertFalse(book.returnItem());
  }

  @Test
  void notSetBorrowingDataAccessThrowsNullPointerException() {
    Book book = new Book("1234567", "Frisby Island", "Glenn Glerum", 2023);
    Assertions.assertThrows(NullPointerException.class, book::borrow);
  }
}