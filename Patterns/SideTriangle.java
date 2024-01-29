
public class SideTriangle {
    public static void main(String[] args) {
        star(5);
        System.out.println();
        no(5);
    }

    public static void star(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int colms = row < n ? row : 2 * n - row;
            for (int col = 1; col <= colms; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void no(int n) {
        int num = 1;
        for (int row = 1; row <= 2 * n; row++) {
            int colms = row < n ? row : 2 * n - row;
            for (int col = 1; col <= colms; col++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}
