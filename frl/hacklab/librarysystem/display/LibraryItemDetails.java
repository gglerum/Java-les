package frl.hacklab.librarysystem.display;

public record LibraryItemDetails(String ean, String title, String author, int year) implements Displayable {

    @Override
    public void printDetails() {
        System.out.println("EAN:" + ean);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}