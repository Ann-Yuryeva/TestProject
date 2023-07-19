import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Integer.*;

//    есть лист строк "22", "57", "89", "41"
//        найти минимальную сумму цифр в листе
//        т.е. в данном примере 2+2=4 будет минимальное число.

public class TestMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("55", "57", "89", "55")); // есть лист строк
        int min = returnSum(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int newNum = returnSum(list.get(i));
            if (newNum < min) {
                min = newNum;
            }
        }
        System.out.println(min);
    }

    public static Integer returnSum(String word) {
        return Integer.parseInt(String.valueOf(word.charAt(0))) +
                Integer.parseInt(String.valueOf(word.charAt(1)));
    }
}
