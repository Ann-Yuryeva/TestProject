class Solution {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
//                System.out.print("[" + i + ", " + j + "]");
                System.out.println("sum " + sum);
                System.out.println("accounts " + accounts[i][j]);
                System.out.println(sum += accounts[i][j]);
                System.out.println();
            }
            System.out.println();
            System.out.println(sum);
            System.out.println();
//            System.out.println();
            if (sum > max) {
                max = sum;
            }
        }
//        System.out.println();
        return max;
    }
}