public class CheckIfSortRot {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int count = 0;
        // For Sorted Rotated Array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i])
                count++;
        }
        // For Sorted Array
        if (nums[nums.length - 1] > nums[0])
            count++;
        // if 0 or 1 pair
        return count <= 1;
    }
}
