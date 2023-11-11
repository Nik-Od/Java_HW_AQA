package HW11;

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryMaterial book1 = new Book("1984", "George Orwell", Genre.FICTION);
        LibraryMaterial magazine1 = new Magazine("National Geographic", 2022);
        LibraryMaterial audiobook1 = new Audiobook("Becoming", "Michelle Obama", 1140);

        book1.checkout();
        book1.search("1984");
        audiobook1.returnMaterial();
        magazine1.search("2023");
        // ... демонстрація роботи інших методів та класів
    }
}

