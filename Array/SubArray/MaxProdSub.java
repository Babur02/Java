package SubArray;

public class MaxProdSub {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSub(arr);
    }

    public static void printSub(int arr[]) {
        int curr = 0;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    curr *= arr[k];
                }
                System.out.println(curr);
                if (maxProd < curr)
                    maxProd = curr;
            }
            // maxProd = Math.max(maxProd, start);
        }
        System.out.println("MaxProd : " + maxProd);
    }
}
