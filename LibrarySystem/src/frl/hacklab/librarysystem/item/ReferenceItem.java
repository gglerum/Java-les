package frl.hacklab.librarysystem.item;

import frl.hacklab.librarysystem.display.Displayable;

/**
 * Class for Reference Items
 */
public class ReferenceItem implements Displayable {

  private final String title;
  private final String description;
  private final String ean;

  /**
   * @param ean         of the reference item
   * @param title       of the reference item
   * @param description of the reference item
   */
  protected ReferenceItem(String ean, String title, String description) {
    this.ean = ean;
    this.title = title;
    this.description = description;
  }

  /**
   * @return ean for Reference Item
   */
  public String getEan() {
    return ean;
  }

  @Override
  public void printDetails() {
    System.out.println("Title: " + title);
    System.out.println("Description: " + description);
  }
}