import java.util.Arrays;
import java.util.Collections;

import static java.lang.String.valueOf;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        // Squaring each element
        for (int i = 0; i < nums.length; i++) {
           nums[i] = (int) Math.pow(nums[i],2);
//            nums[i] *= nums[i];
        }

        // Sorting in non-decreasing order
        for (int j = 0; j < nums.length; j++) { //out loop
            for (int k = j + 1; k < nums.length; k++) { //inner loop
                if (nums[k] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }

        return nums;
    }

}
