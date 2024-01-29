public class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 8, 5, 7, 3, 1 };
        dup(nums);
        System.out.println();
        System.out.println(findDuplicate(nums));
    }

    public static void dup(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    System.out.print(nums[i] + " ");
            }
        }
    }

    private static int findDuplicate(int[] nums) {
        // XOR ing all elements
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        // XOR 1 to n-1
        for (int i = 1; i < nums.length; i++) {
            ans ^= i;
        }
        return ans;
    }
}
