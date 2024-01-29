package SubArray;

public class PrintSubArr {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        print(num);
    }

    public static void print(int num[]) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
}
