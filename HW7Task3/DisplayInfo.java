package HW7Task3;

public class DisplayInfo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Використання калькулятора з числами типу int
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        // Використання калькулятора з числами типу double
        System.out.println("10.5 + 5.3 = " + calculator.add(10.5, 5.3));
        System.out.println("10.5 - 5.3 = " + calculator.subtract(10.5, 5.3));
        System.out.println("10.5 * 5.3 = " + calculator.multiply(10.5, 5.3));
        System.out.println("10.5 / 5.3 = " + calculator.divide(10.5, 5.3));
    }
}

