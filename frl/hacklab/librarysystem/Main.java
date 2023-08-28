package frl.hacklab.librarysystem;

import frl.hacklab.librarysystem.item.Book;
import frl.hacklab.librarysystem.item.DVD;
import frl.hacklab.librarysystem.item.Dictionary;
import frl.hacklab.librarysystem.item.Encyclopedia;
import frl.hacklab.librarysystem.item.Magazine;

public class Main {
    public static void main(String[] args) {
        LibrarySubsystem librarySubsystem = new LibrarySubsystem();

        // Add library items
        librarySubsystem.addItem(new Book("1234567","Book Title", "Author", 2023));
        librarySubsystem.addItem(new Magazine("2345678", "Magazine Title", "Editor", 2023));
        librarySubsystem.addItem(new DVD("3456789", "DVD Title", "Director", 2023));

        // Add reference items
        librarySubsystem.addItem(new Dictionary("English Dictionary", "A comprehensive dictionary."));
        librarySubsystem.addItem(new Encyclopedia("World Encyclopedia", "A collection of knowledge on various topics."));

        // Print details
        librarySubsystem.printAllDetails();
    }
}
