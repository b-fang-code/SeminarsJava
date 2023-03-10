package SeminarJava002;

import java.io.FileWriter;
import java.util.Scanner;

//ЗАДАЧА: Дано четное число N(>0) и символы с1 и с2. Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов с1 и с2, начиная с с1.
public class Tasks {
    public static void main(String[] args) {
        //       System.out.println(build());
        // System.out.println(lettercount());
//        System.out.println(isPolindrome("loovaol"));
        test();
    }

    public static StringBuilder build() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int n = in.nextInt();
        System.out.print("Введите первый элемент: ");
        String first = in.next();
        System.out.print("Введите второй элемент: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append((i % 2 == 0) ? first : second);
        }
        return sb;
    }


//=============================================================================================================
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd  выход: a4b3cd2

    public static StringBuilder lettercount() {
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcdd";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb;
    }

    // Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//    (возвращает boolean значение)
    public static boolean isPolindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту
// строку в простой текстовый файл, обработайте исключения.
    public static void test(){
        StringBuilder sb = new StringBuilder();
        sb.append("Test ".repeat(100));
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        }
        catch (Exception e){
            System.out.println("Fail!");
        }
    }

}
