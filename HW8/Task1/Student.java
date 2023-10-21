package HW8.Task1;

public class Student {
    private String name;
    private int age;

    // Конструктор
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для відображення інформації про студента
    public static void displayStudentInfo(Student student) {
        if (student == null) {
            System.out.println("Дані відсутні.");
            return;
        }
        System.out.println("Ім'я: " + (student.getName() == null ? "Відсутнє" : student.getName()));
        System.out.println("Вік: " + student.getAge());
    }

    public static void main(String[] args) {
        // Створення об'єкта класу Student
        Student student1 = new Student("Олександр", 20);

        // Відображення інформації про студента
        displayStudentInfo(student1);

        // Зміна імені студента на null
        student1.setName(null);
        displayStudentInfo(student1);

        // Присвоєння змінній класу Student значення null
        student1 = null;
        displayStudentInfo(student1);
    }
}

