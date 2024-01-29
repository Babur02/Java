package SubArray;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSub(arr);
        System.out.println();
        int n = 5;
        int top;
        System.out.println(top = n * (n + 1) / 2);
    }

    public static void printSub(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
