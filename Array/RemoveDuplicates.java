public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 5, 5 };
        System.out.println(count(nums));
    }

    public static int count(int nums[]) {
        int ptr = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[ptr] != nums[i]) {
                nums[++ptr] = nums[i];
            }
        }
        // Last idx = size-1
        // size = ptr + 1
        return ptr + 1;
    }
}
