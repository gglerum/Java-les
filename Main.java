interface Displayable {
    void printDetails();
}

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

class LibraryItemBorrowing {
    private boolean onLoan;

    public LibraryItemBorrowing() {
        this.onLoan = false;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void borrow() {
        if (!onLoan) {
            onLoan = true;
            System.out.println("Item has been borrowed.");
        } else {
            System.out.println("Item is already on loan.");
        }
    }

    public void returnItem() {
        if (onLoan) {
            onLoan = false;
            System.out.println("Item has been returned.");
        } else {
            System.out.println("Item was not on loan.");
        }
    }
}

class LibraryItem implements Displayable {
    private LibraryItemDetails details;
    private LibraryItemBorrowing borrowing;

    public LibraryItem(String title, String author, int year) {
        this.details = new LibraryItemDetails(title, author, year);
        this.borrowing = new LibraryItemBorrowing();
    }

    @Override
    public void printDetails() {
        details.printDetails();
        if (borrowing.isOnLoan()) {
            System.out.println("Status: On Loan");
        } else {
            System.out.println("Status: Available");
        }
    }

    public void borrow() {
        borrowing.borrow();
    }

    public void returnItem() {
        borrowing.returnItem();
    }
}

class Book extends LibraryItem {
    public Book(String title, String author, int year) {
        super(title, author, year);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title, String author, int year) {
        super(title, author, year);
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String author, int year) {
        super(title, author, year);
    }
}

class ReferenceItem implements Displayable {
    private String title;
    private String description;

    public ReferenceItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }
}

class Dictionary extends ReferenceItem {
    public Dictionary(String title, String description) {
        super(title, description);
    }
}

class Encyclopedia extends ReferenceItem {
    public Encyclopedia(String title, String description) {
        super(title, description);
    }
}

class LibrarySubystem {
    private List<Displayable> items = new ArrayList<>();

    public void addItem(Displayable item) {
        items.add(item);
    }

    public void printAllDetails() {
        for (Displayable item : items) {
            item.printDetails();
            if (item instanceof LibraryItem) {
                LibraryItem libraryItem = (LibraryItem) item;
                if (libraryItem.isOnLoan()) {
                    System.out.println("Status: On Loan");
                } else {
                    System.out.println("Status: Available");
                }
            }
            System.out.println("------------------------");
        }
    }
}

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
