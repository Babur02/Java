public class Pair {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printPair(arr);
        System.out.println();
        int n = 5;
        int top;
        System.out.println(top = n * (n - 1) / 2);

    }

    public static void printPair(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]; // 1
            for (int j = i + 1; j <= arr.length; j++) { // 2,3,4,5
                System.out.print("(" + current + "," + j + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
}
// tp=n*(n-1)/2
