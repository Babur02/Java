public class RotateByK {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        int n = nums.length - 1;
        k %= nums.length;
        reverse(nums, 0, n);
        // for k=3, [6,5,4,3,2,1] => idx[0,1,2] => 0 to k-1=2
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int[] reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
