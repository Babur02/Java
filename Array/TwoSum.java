import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        int sum[] = twoSum(nums, target);
        System.out.println(sum[0] + " " + sum[1]);
        System.out.println(twoPointer(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static boolean twoPointer(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                List<Integer> temp = Arrays.asList(nums[start], nums[end]);
                System.out.println(temp);
                return true;
            } else if (nums[start] + nums[end] < target)
                start++;
            else
                end--;
        }
        return false;
    }
}
