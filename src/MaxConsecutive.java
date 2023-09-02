public class MaxConsecutive {
    public static void main(String[] args) {
        MaxConsecutive m = new MaxConsecutive();
        int[] nums = {0, 0, 0}; //[1,1,0,1,1,1] / 1,0,1,1,0,1
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else count = 0;
        }
        return max;
    }
}
