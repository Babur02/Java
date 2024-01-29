

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows (odd no)");
        int rows = sc.nextInt();
        int spaces = 0;
        int stars = rows;
        // Upper Pattern
        for (int i = 1; i <= rows; i++) {
            // Printing Spaces
            for (int j = 1; j <= i; j++)
                System.out.print("  "); // 2space

            // Printing Stars
            for (int j = 1; j <= rows; j++) {
                System.out.print("*  "); // 1space star 2space
            }
            // End line after every row
            System.out.println();
        }
    }

    public static void star(int n) {
       

        // Down Pattern
        for (int row = 1; row <= n; row++) {
            // Printing Spaces
            for (int col = 1; col <= n - row + 1; col++)
                System.out.print("  "); // 2space

            // Printing Stars
            for (int col = 1; col <= row; col++)
                System.out.print(" *  "); // 1space star 2space

            // End line after every row
            System.out.println();
        }
    }
}
