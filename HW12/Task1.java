package HW12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        // Створення ArrayList та додавання чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(34);
        numbers.add(47);
        numbers.add(58);

        // Фільтрація списку для відбору тільки парних чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Вивід відфільтрованих чисел
        evenNumbers.forEach(System.out::println);
    }
}

