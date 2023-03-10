package SeminarJava002;

import java.util.Random;

public class TestSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            sb.append((char)(random.nextInt(10000) - 10));
        }
        System.out.println(sb);
    }
}
