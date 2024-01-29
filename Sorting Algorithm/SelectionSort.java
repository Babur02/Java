// Select Minimum, O(n^2), UnstableAlgo
// Pick the smallest from unsorted put it at the beginning

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 2, 1, 3 };
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
