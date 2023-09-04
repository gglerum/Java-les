package frl.hacklab.librarysystem.display;

public class LibraryItemDetails implements Displayable {
    private final String title;
    private final String author;
    private final int year;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getEan() {
        return ean;
    }

    private final String ean;

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