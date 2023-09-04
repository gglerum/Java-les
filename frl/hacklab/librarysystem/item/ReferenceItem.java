package frl.hacklab.librarysystem.item;

import frl.hacklab.librarysystem.display.Displayable;

public class ReferenceItem implements Displayable {
    private final String title;
    private final String description;

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