package HW11;

public class Book extends LibraryMaterial {
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnMaterial() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }


    @Override
    public boolean search(String keyword) {
        boolean found = title.contains(keyword) || author.contains(keyword) || genre.name().contains(keyword.toUpperCase());
        System.out.println("Пошук за '" + keyword + "' у книзі '" + title + "': " + (found ? "знайдено" : "не знайдено"));
        return found;
    }

}

