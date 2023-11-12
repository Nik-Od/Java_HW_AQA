package HW11;

public interface LibraryActions {
    void checkoutMaterial(LibraryMaterial material);
    void returnMaterial(LibraryMaterial material);
    LibraryMaterial searchMaterial(String keyword);
}

