package SeminarJava002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;
//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращённый предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл
public class task5 {
    static Logger logger = Logger.getLogger("Ex5");
    public static void main(String[] args) {
        ex5("C:\\Users\\b-fang\\Desktop\\Java\\SeminarsJava");
    }

    private static void ex5(String pathDir) {
        String[] dirListNames;
        try {
            dirListNames = convertPathToNamesArr(pathDir);
        } catch (RuntimeException e) {
            logger.severe(e.getMessage());
            throw e;
        }

        StringBuilder sb = new StringBuilder();

        for (String fileName : dirListNames) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/lesson2.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            logger.severe(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        if (!dir.isDirectory()) {
//            return new String[]{};
            throw new RuntimeException("Директория по заданному пути не найдена");
        }
        return dir.list();
    }
}
