package HW11;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryActions {
    private List<LibraryMaterial> materials;

    public Library() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(LibraryMaterial material) {
        materials.add(material);
    }

    @Override
    public void checkoutMaterial(LibraryMaterial material) {
        if (material.isAvailable) {
            material.checkout();
        } else {
            System.out.println(material.title + " is currently not available.");
        }
    }

    @Override
    public void returnMaterial(LibraryMaterial material) {
        material.returnMaterial();
        System.out.println(material.title + " has been returned.");
    }

    @Override
    public LibraryMaterial searchMaterial(String keyword) {
        for (LibraryMaterial material : materials) {
            if (material.search(keyword)) {
                System.out.println(material.title + " found.");
                return material;
            }
        }
        System.out.println("No material found with keyword: " + keyword);
        return null;
    }
}

