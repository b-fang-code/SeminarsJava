package SeminarJava005;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MentorSolution {
    public static void main(String[] args) {
        System.out.println("MMCMXCIX -> " + ex3("MMCMXCIX"));
        System.out.println("2999 -> " + ex4(2999));
    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }

        return decimalNum;

    }

    public static String ex4(int number) {
        Map<Integer, String> arabicToRomanConstMap = Map.ofEntries(
                Map.entry(1000, "M"),
                Map.entry(900, "CM"),
                Map.entry(500, "D"),
                Map.entry(400, "CD"),
                Map.entry(100, "C"),
                Map.entry(90, "XC"),
                Map.entry(50, "L"),
                Map.entry(40, "XL"),
                Map.entry(10, "X"),
                Map.entry(9, "IX"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(1, "I")
        );

        Map<Integer, String> arabicToRomanMap = new TreeMap<>(Comparator.reverseOrder());
        arabicToRomanMap.putAll(arabicToRomanConstMap);

        StringBuilder romanNumSB = new StringBuilder();
        for (Map.Entry<Integer, String> entry : arabicToRomanMap.entrySet()) {
            int arabic = entry.getKey();
            String roman = entry.getValue();
            while (number >= arabic) {
                romanNumSB.append(roman);
                number -= arabic;
            }
        }
        return romanNumSB.toString();
    }
}
