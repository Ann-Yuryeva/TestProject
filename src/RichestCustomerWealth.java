class RichestCustomerWealth {
    public static void main(String[] args) {
//        int[][] accounts = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(maximumWealth(accounts));
            NumberOfSteps n = new NumberOfSteps();
            n.numberOfSteps(8);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
//                System.out.print("[" + i + ", " + j + "]");
                System.out.println("sum " + sum);
                System.out.println("accounts " + i);
                System.out.println(sum += i);
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