public class RowSum {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2 }, { 6, 5 } };
        rowSum(nums);
        System.out.println(MaxRowSum(nums));
    }

    public static void rowSum(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            int sum = 0;
            for (int col = 0; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
            System.out.println(sum);
        }
    }

    public static int MaxRowSum(int[][] nums) {
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;
        for (int row = 0; row < nums.length; row++) {
            int sum = 0;
            for (int col = 0; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
            maxSum = Math.max(maxSum, sum);
            if (maxSum > sum)
                rowIndex = row;
        }
        System.out.println("MaxSum : " + maxSum);
        return rowIndex;
    }

}
