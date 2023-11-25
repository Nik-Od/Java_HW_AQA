package HW9;

public class ReverseString {

    public static void main(String[] args) {
        String original = "Java, World!";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Базовий випадок: якщо рядок пустий або складається з одного символу
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Рекурсивний виклик: отримуємо перший символ рядка і додаємо його після реверсу решти рядка
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}