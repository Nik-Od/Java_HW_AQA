package HW11;

public class Audiobook extends LibraryMaterial {
    private int duration; // тривалість в хвилинах

    public Audiobook(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " by " + author + " has been checked out.");
        } else {
            System.out.println(title + " by " + author + " is not available.");
        }
    }

    @Override
    public void returnMaterial() {
        isAvailable = true;
        System.out.println(title + " by " + author + " has been returned.");
    }

    @Override
    public boolean search(String keyword) {
        boolean found = title.contains(keyword) || author.contains(keyword);
        System.out.println("Пошук за '" + keyword + "' у аудіокнизі '" + title + "': " + (found ? "знайдено" : "не знайдено"));
        return found;
    }

}

