import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 }; // 3 = m-1
        int nums2[] = { 7, 8, 9 }; // 6 = n-1
        // mergeInNums1(nums1, nums2);
        System.out.println();
        mergeInNewArray(nums1, nums2);
    }

    public static void mergeInNums1(int nums1[], int nums2[]) {
        int n = nums2.length; // (n)
        int m = nums1.length - n; // (m+n)
        int tail1 = m - 1, tail2 = n - 1;
        int end = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            if (nums1[tail1] >= nums2[tail2]) {
                nums1[end] = nums1[tail1];
                tail1--;
            } else {
                nums1[end] = nums2[tail2];
                tail2--;
            }
            end--;
        }
        // int nums1[] = { 4, 5, 6 };
        // int nums2[] = { 1, 2, 3, 0, 0, 0 };
        // Remaining elements in nums2[]
        while (tail2 >= 0) {
            nums1[end] = nums2[tail2];
            tail2--;
            end--;
        }
        // Remaining elements in nums1[]
        while (tail1 >= 0) {
            nums1[end] = nums2[tail1];
            tail1--;
            end--;
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void mergeInNewArray(int nums1[], int nums2[]) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int newArray[] = new int[nums1.length+nums2.length];
        int ptr1 = 0, ptr2 = 0, idx = 0;
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                newArray[idx] = nums1[ptr1];
                ptr1++;
                idx++;
            } else {
                newArray[idx] = nums2[ptr2];
                ptr2++;
                idx++;
            }
        }
        // Copy remaining first array elements
        while (ptr1 < nums1.length) {
            newArray[idx] = nums1[ptr1];
            idx++;
            ptr1++;
        }
        // Copy remaining second array elements
        while (ptr2 < nums2.length) {
            newArray[idx] = nums2[ptr2];
            idx++;
            ptr2++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
