import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int ar[][] = { { 1, 2 }, { 6, 5 } };

        Scanner sc = new Scanner(System.in);

        int row = arr.length;
        int col = arr[0].length;

        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Search
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int key = 5;
                if (arr[i][j] == key) {
                    System.out.println("Key found at index : " + i + "," + j);
                }

            }
        }
    }

}