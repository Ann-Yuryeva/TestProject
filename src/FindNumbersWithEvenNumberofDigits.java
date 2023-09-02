public class FindNumbersWithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int count; // сколько раз потребовалось число делить на 10
        int evenNum = 0; //сколько чисел является четными
        for (int num : nums) {
            count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }

            if (count % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }
}