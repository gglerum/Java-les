package frl.hacklab.librarysystem;

import frl.hacklab.librarysystem.display.Displayable;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages adding and displaying Library Items
 */
public class LibrarySubsystem {

  private final List<Displayable> items = new ArrayList<>();

  /**
   * Add item to list of displayable items
   *
   * @param item that will be added to the displayable list
   */
  public void addItem(Displayable item) {
    items.add(item);
  }

  /**
   * Add list to our list with displayable items
   *
   * @param items that will be added to the existing list of displayable items
   */
  public void addItems(List<Displayable> items) {
    this.items.addAll(items);
  }

  /**
   * Print all the details of the library items in the displayable list
   */
  public void printAllDetails() {
    for (Displayable item : items) {
      item.printDetails();
      System.out.println("------------------------");
    }
  }
}