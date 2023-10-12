package HW7Task2;

public class Calculation {
    public static void main(String[] args) {
        // Створення двох екземплярів класу Rectangle
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(7);

        // Виведення площі та периметру для кожного прямокутника
        System.out.println("Прямокутник 1 - Площа: " + rectangle1.getArea() + ", Периметр: " + rectangle1.getPerimeter());
        System.out.println("Прямокутник 2 (квадрат) - Площа: " + rectangle2.getArea() + ", Периметр: " + rectangle2.getPerimeter());
    }
}

