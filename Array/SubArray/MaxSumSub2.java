package SubArray;

public class MaxSumSub2 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSub(arr);
    }

    public static void printSub(int arr[]) {
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                curr = 0;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < curr)
                    maxSum = curr;
            }
        }
        System.out.println("MaxSum : " + maxSum);
    }
}
