package run;

import sun.awt.SunHints;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> Map = new HashMap<Integer, String>(20);
        Map.put(1, "Один");
        Map.put(2, "Два");
        Map.put(3, "Три");
        Map.put(4, "Четыре");
        Map.put(5, "Пять");
        Map.put(6, "Шесть");
        Map.put(7, "Семь");
        Map.put(8, "Восемь");
        Map.put(9, "Девять");
        Map.put(10, "Десять");
        Map.put(11, "Одинадцать");
        Map.put(12, "Двенадцать");
        Map.put(13, "Тринадцать");
        Map.put(14, "Четырнадцать");
        Map.put(15, "Пятнадцать");
        Map.put(16, "Шестнадцать");
        Map.put(17, "Семнадцать");
        Map.put(18, "Восемнадцать");
        Map.put(19, "Девятьнадцать");
        Map.put(20, "Двадцать");

        Set<Integer> keys = Map.keySet();
        Collection<String> valyes = Map.values();
        for (Map.Entry<Integer, String> item : Map.entrySet()) {
            if (item.getValue().contains("дцать")) {

                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
            }
        }
    }

}
