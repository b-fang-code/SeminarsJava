package SeminarJava006;

import java.util.*;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000.
// Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Task02 {
    public static void main(String[] args) {
        System.out.println(createArray());
        percent(createArray());
    }

    private static List createArray() {
        Random rnd = new Random();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arr.add(rnd.nextInt(1, 1000));
        }
        return arr;
    }

    private static void percent(List arr) {
        Set<Double> result = new HashSet<>();
        result.addAll(arr);
        System.out.println(result);
        double percent = (result.size() * 100 * 1.0) / arr.size();
        System.out.println(percent + "% уникальных чисел");
    }
}
