// (Insert at right position), O(n^2), StableAlgo
// Pick first element from unsorted part and place it in its correct position in sorted part

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 2, 1, 3 };
        insertionSort(arr);
    }

    // Best case O(n)
    // Worst case O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
