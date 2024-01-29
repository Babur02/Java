public class MirrorRightTriangle {
    public static void main(String[] args) {
        star(4);
        System.out.println();
        triangle(4);
        System.out.println();
        downtriangle(4);
    }

    public static void star(int n) {
        for (int row = 1; row <= n; row++) {
            // Printing Spaces
            for (int col = 1; col <= n - row + 1; col++)
                System.out.print("  "); // 2space

            // Printing Stars
            for (int col = 1; col <= row; col++)
                System.out.print("* "); // 1space

            // End line after every row
            System.out.println();
        }
    }

    public static void triangle(int n) {
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

    public static void downtriangle(int n) {
        for (int row = 1; row <= n; row++) {
            // Printing Spaces
            for (int col = 1; col <= n; col++)
                if (col < row)
                    System.out.print("  "); // 2space
                else
                    // Printing Stars
                    System.out.print(" *  "); // 1space star 2space

            // End line after every row
            System.out.println();
        }
    }
}
