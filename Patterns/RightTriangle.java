public class RightTriangle {
    public static void main(String[] args) {
        star(4);
        System.out.println();
        alpha(4);
        System.out.println();
        alphar(4);
        System.out.println();
        alpharepeat3(4);
        System.out.println();
        no(4);
    }

    public static void star(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void alpha(int n) {
        char ch = 'a';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void alphar(int n) {
        char ch = 'a';
        for (int row = 1; row <= n; row++) {
            ch = 'a';
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void alpharepeat3(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
            ch++;
        }
    }

    public static void no(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
