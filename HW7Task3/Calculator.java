package HW7Task3;

public class Calculator {

    // Методи додавання
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Методи віднімання
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Методи множення
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Методи ділення
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль!");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Ділення на нуль!");
        }
        return a / b;
    }
}

