public class ReverseRightTriangle {
    public static void main(String[] args) {
        star(4);
        System.out.println();
    }

    public static void star(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
