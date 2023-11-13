package HW12;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        // Створення та заповнення першого HashSet
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(2);
        set1.add(33);

        // Створення та заповнення другого HashSet
        Set<Integer> set2 = new HashSet<>();
        set2.add(48);
        set2.add(51);
        set2.add(68);

        // Створення третього HashSet та об'єднання двох інших
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Вивід результату
        System.out.println(unionSet);
    }
}

