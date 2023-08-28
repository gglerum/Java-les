package frl.hacklab.librarysystem;

import java.util.ArrayList;
import java.util.List;

import frl.hacklab.librarysystem.display.Displayable;

public class LibrarySubsystem {
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