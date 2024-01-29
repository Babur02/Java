public class Square {
    public static void main(String[] args) {
        star(4);
        System.out.println();
        alpha(4);
        System.out.println();
        hollowSquare(4);
        System.out.println();
        alpharepeat(4);
        System.out.println();
        alpharepeat2(4);

    }

    public static void star(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void alpha(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    public static void alpharepeat(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            ch = 'A';
            for (int col = 1; col <= n; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    public static void alpharepeat2(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
            ch++;
        }
    }

    public static void hollowSquare(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
/*
 * 1234
 * 1234 (col) different
 * 1234
 * 1234
 */
/*
 * 1111
 * 2222 (row) similar
 * 3333
 * 4444
 */