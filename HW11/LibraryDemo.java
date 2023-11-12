package HW11;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", Genre.FICTION);
        Magazine magazine1 = new Magazine("National Geographic", 2022);

        library.addMaterial(book1);
        library.addMaterial(magazine1);

        library.checkoutMaterial(book1);
        // ... демонстрація роботи інших методів ...

        library.returnMaterial(book1);
        LibraryMaterial searchedMaterial = library.searchMaterial("1984");
        // ... додаткова демонстрація ...
    }
}


