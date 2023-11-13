package HW12;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        // Створення HashMap
        Map<String, Cow> cows = new HashMap<>();

        // Додавання корів в HashMap
        for (int i = 1; i <= 10; i++) {
            String cowName = "Cow" + i;
            cows.put(cowName, new Cow(cowName));
        }

        // Вивід результату
        for (Map.Entry<String, Cow> entry : cows.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

