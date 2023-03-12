package SeminarJava003;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
//Записать в файл txt
public class task02 {
    public static void main(String[] args) {
        planets();
    }

    private static void planets() {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");
        ArrayList<String> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            arr.add(names.get(rnd.nextInt(names.size())));
        }
        System.out.println(arr);

        for (int i = 0; i < names.size(); i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (names.get(i).equals(arr.get(j))) {
                    count++;
                }
            }
            System.out.printf("%s\t =>\t%s%n", names.get(i), count);
            //System.out.println(names.get(i) + " = " + count);
        }
        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1;
            while (j < arr.size()) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                } else {
                    j++;
                }
            }
        }
        System.out.println(arr);

        File planet = new File("C:\\Users\\b-fang\\Desktop\\Java\\SeminarsJava\\src\\main\\java\\" +
                "SeminarJava003\\planets.txt");
    if (!planet.isFile()){
        throw new RuntimeException("Неверный файл!");
    }
    try(PrintWriter pw = new PrintWriter(planet)){
        pw.println(arr);
    }
    catch (IOException e){
        e.printStackTrace();
        }
    }
}
