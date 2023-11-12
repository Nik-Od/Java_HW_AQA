package HW11;

public abstract class LibraryMaterial {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryMaterial(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public abstract void checkout();

    public abstract void returnMaterial();

    public abstract boolean search(String keyword);
}

