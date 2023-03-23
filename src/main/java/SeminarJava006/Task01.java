package SeminarJava006;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

// Как работает Set
public class Task01 {
    public static void main(String[] args) {
        ex0();
    }
    private static void ex0(){
        List<String> data = List.
                of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять");
        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));
    }
}
