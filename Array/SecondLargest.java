public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 3, 4 };
        secondLargest(arr);
    }

    public static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i])
                largest = arr[i];
        }
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (secondLargest < arr[i] && largest != arr[i])
                secondLargest = arr[i];
        }
        System.out.println(secondLargest);
    }
}
