public class WaveArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        swapAlternate(nums);
    }

    public static void swapAlternate(int nums[]) {
        for (int i = 0; i < nums.length; i += 2) {

            if (nums[i + 1] < nums.length) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
