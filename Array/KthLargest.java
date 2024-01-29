import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        // lar(nums);
        System.out.println("Largest : " + lar(nums));
        // small(nums);
        System.out.println("Smallest : " + small(nums));

    }

    public static int lar(int arr[]) {
        int k = 2;
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static int small(int arr[]) {
        int k2 = 2;
        Arrays.sort(arr);
        return arr[k2 - 1];
    }

}
