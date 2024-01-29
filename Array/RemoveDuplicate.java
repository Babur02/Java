import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 8, 4, 5, 3, 6, 6, 5, };
        dup(nums);
    }

    public static void dup(int nums[]) {
        Arrays.sort(nums);
        int temp[] = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
        }
        temp[j++] = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
