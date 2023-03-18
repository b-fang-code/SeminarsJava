package SeminarJava005;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Написать метод, который переведет число из римского формата записи в арабский.
//Например, MMXXII = 2022
public class Task02 {
    public static void main(String[] args) {
        reformatNumber();
    }

    private static Integer reformatNumber() {
        Map<String, Integer> romanianNumber = romeNumbers();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в римском формате: ");
        String rom = in.next();
        int result = 0;
        for (int i = 0; i < rom.length() - 1; i++) {
            int current = romanianNumber.get(Character.toString((rom.charAt(i))));
            int next = romanianNumber.get(Character.toString((rom.charAt(i + 1))));
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        result += romanianNumber.get(Character.toString((rom.charAt(romeNumbers().size()))));
        System.out.println(result);
        return result;

    }

    private static Map<String, Integer> romeNumbers() {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        return numbers;

    }
}
