package SeminarJava004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task01 {
    public static void main(String[] args) {
        speedTest();
    }

    private static void speedTest() {
        final int SIZE = 1000_000;
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0,1);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        List <Integer>  linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0,1);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }
}
