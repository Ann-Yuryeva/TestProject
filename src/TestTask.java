import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//есть строковый массив. Нужно вывести повторяюшиеся элементы массива
// сделать с array и с List

import java.util.*;

public class TestTask {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("b", "m", "1", "b", "4", "m", "a", "2"));
        String[] array = {"b", "m", "1", "b", "4", "m", "a", "2"};
        identifyDublicatesInList(list);
        identifyDublicatesInArray(array);
    }

    public static void identifyDublicatesInList(List<String> list) {
        Map<String, Integer> roster = new HashMap<>();
        for (String s : list) {
            if (!roster.containsKey(s)) {
                roster.put(s, 0);
            } else {
                roster.put(s, roster.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> pairs : roster.entrySet()) {
            if (pairs.getValue() == 1) {
                System.out.println(pairs.getKey() + " ");
            }
        }
    }

    public static void identifyDublicatesInArray(String[] arr) {
        // Bubble sort
        for (int i = 0; i < arr.length; i++) { //out loop
            for (int j = i+1; j < arr.length; j++) { //inner loop
                if (arr[j].compareTo(arr[i]) < 0) { // comparing for string elements in array
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        Arrays.stream(arr).forEach(System.out::println);

        String prev = null;
        for (String s : arr) {
            if (s != null && s.equals(prev)) {
                System.out.println(s);
            }
            prev = s;

        }
    }
}


