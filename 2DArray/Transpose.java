public class Transpose {
    public static void main(String[] args) {
        int ar[][] = { { 1, 2 }, { 6, 5 } };

        System.out.println("Original Matrix");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        int transpose[][] = trans(ar);
        System.out.println("Transpose Matrix");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        trans2(ar);
    }

    public static int[][] trans(int ar[][]) {
        int row = ar.length;
        int col = ar[0].length;
        int transpose[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = ar[j][i];
            }
        }
        return transpose;
    }

    public static void trans2(int ar[][]) {
        int row = ar.length;
        int col = ar[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
       print(ar);
    }
     public static void print(int ar[][])
     {
         System.out.println("Transpose Matrix");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
     }

    // public static void trans(int ar[][]) {
    // System.out.println("Transpose Matrix");
    // for (int i = 0; i < ar.length; i++) {
    // for (int j = 0; j < ar[0].length; j++) {
    // System.out.print(ar[j][i] + " ");
    // }
    // System.out.println();
    // }
    // }

}
