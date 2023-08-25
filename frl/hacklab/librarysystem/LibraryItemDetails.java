package frl.hacklab.librarysystem;

class LibraryItemDetails implements Displayable {
    private String title;
    private String author;
    private int year;

    public LibraryItemDetails(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}