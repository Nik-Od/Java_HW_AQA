package HW7Task1;

public class Person {
    private String name;
    private int age;

    // Конструктор класу Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для виведення інформації про персону
    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age);
    }
}
