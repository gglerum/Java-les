
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