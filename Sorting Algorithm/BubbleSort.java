// Swap Alternative, O(n^2), StableAlgo
// Largest elements comes to the end of array by swapping with adjacent elements

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 2, 1, 3 };
        bubbleSort(arr);
    }

     // Worst case O(n^2)    
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // Best case O(n)
            if (!swap)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
