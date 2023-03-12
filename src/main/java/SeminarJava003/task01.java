package SeminarJava003;

import java.util.*;

// Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class task01 {
    public static void main(String[] args) {
        sortingList();

    }

    private static void sortingList() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (random.nextInt(1, 100)));
        }
        System.out.print("Исходный массив: ");
        System.out.println(list);
        Collections.sort(list);
        //list.sort(Comparator.naturalOrder());// Алтернативный метод сортировки
        System.out.print("Отсортированный массив: ");
        System.out.println(list);

    }
}
