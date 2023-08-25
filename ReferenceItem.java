import frl.hacklab.librarysystem.Displayable;

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