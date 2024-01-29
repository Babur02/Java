public class ColSum {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2 }, { 6, 5 } };
        colSum(nums);
    }

    public static void colSum(int[][] nums) {
        for (int col = 0; col < nums[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < nums.length; row++) {
                sum += nums[row][col];
            }
            System.out.println(sum);
        }
    }
}
