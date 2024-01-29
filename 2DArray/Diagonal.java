public class Diagonal {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // System.out.println(sumD(arr));
        System.out.println(sumDiagonal(arr));
    }

    // public static int sumD(int arr[][]) {
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[0].length; j++) {
    //             if (i == j)
    //                 sum += arr[i][j];
    //             else if (i + j == arr.length - 1)
    //                 sum += arr[i][j];
    //         }
    //     }
    //     return sum;
    // }

    public static int sumDiagonal(int arr[][]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
    // PD
    sum += arr[i][i];

    // SD n-1=i+j, j=n-1-i
    sum += arr[i][arr.length - 1 - i];
    }
    return sum;
    }
}
