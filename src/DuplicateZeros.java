import java.util.Arrays;
//          [LeetCode]#3245.DuplicateZeros
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//        Input: arr = [1,0,2,3,0,4,5,0]
//        Output: [1,0,0,2,3,0,0,4]
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        /*for (int i = 0; i < arr.length; i++) {// 1,0,2,3,0,4,5,0
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                    System.out.println(Arrays.toString(arr));
                }
//                arr[++i] = 0;
                i++;
            }
            System.out.println();
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }*/
        int[] arr2 = new int[arr.length];
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (arr[j] != 0) {
                arr2[i] = arr[j];
            } else {
                arr2[i++] = 0;
                arr2[i] = 0;
            }
            j++;
        }
        System.arraycopy(arr2, 0, arr, 0, arr.length);
//        arr = arr2;
//        System.out.println(Arrays.toString(arr));
    }
}