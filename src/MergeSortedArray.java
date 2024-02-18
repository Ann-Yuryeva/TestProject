import java.util.Arrays;
//[LeetCode]#3253.MergeSortedArray
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.


public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);

    }
}