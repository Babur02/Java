public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 2, 3, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int nums[]) {
        int maj = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i])
                count++;
            else if (count == 0) {
                maj = nums[i];
                count = 1;
            } else
                count--;
        }
        return maj;
    }
}
