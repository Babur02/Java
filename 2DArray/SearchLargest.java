public class SearchLargest {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(largest(arr));
    }

    public static int largest(int arr[][]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (lar < arr[i][j])
                    lar = arr[i][j];
            }
        }
        return lar;
    }
}
