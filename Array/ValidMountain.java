public class ValidMountain {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        validMountain(nums);
    }

    public static void validMountain(int nums[]) {
        if (nums.length < 3)
            System.out.println("Invalid");
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[start + 1])
                start++;
            else if (nums[end] < nums[end-1])
                end--;
            else
                break;
        }
        if (start != 0 && end != nums.length - 1 && start == end)
            System.out.println("Valid");
        else
            System.out.println("invalid");
    }
}
