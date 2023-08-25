public class Main {
    public static void main(String[] args) {
        LibrarySubsystem librarySubsystem = new LibrarySubsystem();

        // Add library items
        librarySubsystem.addItem(new Book("Book Title", "Author", 2023));
        librarySubsystem.addItem(new Magazine("Magazine Title", "Editor", 2023));
        librarySubsystem.addItem(new DVD("DVD Title", "Director", 2023));

        // Add reference items
        librarySubsystem.addItem(new Dictionary("English Dictionary", "A comprehensive dictionary."));
        librarySubsystem.addItem(new Encyclopedia("World Encyclopedia", "A collection of knowledge on various topics."));

        // Print details
        librarySubsystem.printAllDetails();
    }
}
