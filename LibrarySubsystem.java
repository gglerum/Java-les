import java.util.ArrayList;
import java.util.List;

class LibrarySubsystem {
    private List<Displayable> items = new ArrayList<>();

    public void addItem(Displayable item) {
        items.add(item);
    }

    public void printAllDetails() {
        for (Displayable item : items) {
            item.printDetails();
            System.out.println("------------------------");
        }
    }
}