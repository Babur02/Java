public class Parallelogram {
    public static void main(String[] args) {
        star(5);
    }

    public static void star(int n) {
        for (int row = 1; row <= n; row++) {
            // Printing Spaces
            for (int col = 1; col <= row; col++)
                System.out.print("  "); // 2space

            // Printing Stars
            for (int col = 1; col <= n; col++)
                System.out.print(" *  "); // 1space star 2space

            // End line after every row
            System.out.println();
        }
    }
}
