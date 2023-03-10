package SeminarJava002;
import java.util.Scanner;
public class MentorSolutions {
    public static void main(String[] args) {
        task2();
    }

    //ЗАДАЧА: Дано четное число N(>0) и символы с1 и с2. Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов с1 и с2, начиная с с1.
    private static String task1(char c1, char c2, int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }


//=============================================================================================================
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd  выход: a4b3cd2



    private static void task2() {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter a string -> ");
//        String str = in.next();
        String str = "aaaabbbcdd";
        char[] chars = str.toCharArray();
        char current = chars[0];
        char next = chars[0];
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            next = chars[i];
            count++;
            if (next != current) {
                sb.append(current);
                if (count > 1) {
                    sb.append(count);
                    count = 0;
                }
                current = next;
            }
        }
        if (count > 1) {
            sb.append(current).append(count);
        }

        System.out.println(sb);
    }
//---------------------------------------------------------------------------------------------------------------
    private static String ex2(String s) {
        if (s.trim().length() == 0) {
            return "";
        }

        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        char curr = prev;


        for (int i = 1; i < s.length() - 1; i++) {
            prev = s.charAt(i - 1);
            curr = s.charAt(i);
            if (prev != curr) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
        }

        return sb.toString();
    }
}
