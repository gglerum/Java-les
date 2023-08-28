package frl.hacklab.librarysystem.display;

public class LibraryItemDetails implements Displayable {
    private String title;
    private String author;
    private int year;
    private String ean;

    public LibraryItemDetails(String ean, String title, String author, int year) {
        this.ean = ean;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void printDetails() {
        System.out.println("EAN:" + ean);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}