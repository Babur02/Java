import java.util.ArrayList;

public class TripletsGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 12;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
