package SeminarJava001;
// ЗАДАЧА: Написать программу, котораю запросит пользователя ввести <Имя> в консоли.Получит введенную строку
// и выведет в консоль сообщение "Привет, <Имя>!"


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        inputNameAndPrint();
        maximumOnes();
    }


    private static void inputNameAndPrint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.next();
        System.out.printf("Hello, %s!", name);
    }


// ===============================================================================================================
// ЗАДАЧА: Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1], вывести максимальное количество подряд идущих 1.

    private static void maximumOnes() {
        int[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOne = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (maxOne < count) {
                    maxOne = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxOne);
    }
}