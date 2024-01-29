package Recursion;

public class CheckSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sort(arr, 0));
    }

    public static boolean sort(int arr[], int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] > arr[i + 1])
            return false;

        return sort(arr, i + 1);
    }
}
