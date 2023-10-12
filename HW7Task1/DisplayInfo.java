package HW7Task1;

public class DisplayInfo {
    public static void main(String[] args) {
        // Створення двох екземплярів класу Person
        Person person1 = new Person("Олексій", 25);
        Person person2 = new Person("Марія", 30);

        // Виведення інформації про обох персон
        person1.displayInfo();
        person2.displayInfo();
    }
}

