package SeminarJava004;

import java.util.*;

//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида
//text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
public class task02 {
    public static void main(String[] args) {
        ex01();
    }

    private static void ex01() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "banana", "tomato", "strawberry", "melon");

        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inpunString = in.nextLine();

            if (inpunString.isBlank()) {
                System.out.println("Строка не должна быть пустой!");
                continue;
            }
            if (inpunString.equalsIgnoreCase("Горшочек, не вари!")) {
                break;
            }
            if (inpunString.equalsIgnoreCase("print~all")) {
                for (int i = 0; i < wordsList.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                }
            }
            if (!inpunString.contains("\\~")) {
                System.out.println("Строка не содержит тильду!");
                continue;
            }
            String[] parts = inpunString.split("\\~");
            String word = parts[0];
            int num = 0;
            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа!");
                continue;
            }
            if (num < 0 || num > wordsList.size() + 1) {
                System.out.println("Число должно быть в пределах от 1 до " + (wordsList.size() + 1));
                continue;
            }
            if (word.equalsIgnoreCase("print")) {
                System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                wordsList.remove(num - 1);
            } else if (num == wordsList.size() + 1) {
                wordsList.add(word);
                System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num - 1, word);
                System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
            }
        }
    }
}
