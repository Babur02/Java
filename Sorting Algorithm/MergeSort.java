// O(nlogn) || Space O(n)

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 2, 1 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int newArray[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j])
                newArray[k++] = nums[i++];
            else
                newArray[k++] = nums[j++];
        }
        while (i <= mid) {
            newArray[k++] = nums[i++];
        }
        while (j <= end) {
            newArray[k++] = nums[j++];
        }
        for (int val : newArray)
            nums[start++] = val;
    }
}
