public class Wave {
    public static void main(String[] args) {
        int nums[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        for (int col = 0; col < nums[0].length; col++) {
            if (col % 2 == 1) {
                // Odd index => Bottom to Top
                for (int row = nums.length - 1; row >= 0; row--) {
                    System.out.print(nums[row][col] + " ");
                }
                System.out.println();
            } else {
                // Even index => Top to Bottom
                for (int row = 0; row < nums.length; row++) {
                    System.out.print(nums[row][col] + " ");
                }
                System.out.println();
            }

        }
    }
}
