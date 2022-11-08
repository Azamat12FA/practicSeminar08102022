package Task1;

import java.util.*;

public class CounterCharInString {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите строку любой длины: ");
        counter(in.nextLine());

    }

    public static void counter(String str) {
        Map<String, Integer> count = new HashMap<>();

        ArrayList<String> chars = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i = 0; i < chars.size(); i++) {
            count.put(chars.get(i), 1);
            for (int j = i + 1; j < chars.size(); j++) {
                if (chars.get(i).equals(chars.get(j))) {
                    count.put(chars.get(i), count.get(chars.get(i)) + 1);
                    chars.remove(j);
                }
            }
        }

        printMap(count);
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Символ: " + entry.getKey() + ", Повторений: " + entry.getValue());
        }
    }

}
