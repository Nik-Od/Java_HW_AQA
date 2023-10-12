package HW7Task2;

public class Rectangle {
    private double width;
    private double height;

    // Перший конструктор, який приймає ширину та висоту
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Другий конструктор, який створює квадрат з вказаним розміром сторони
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    // Метод для обчислення площі прямокутника
    public double getArea() {
        return width * height;
    }

    // Метод для обчислення периметру прямокутника
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

