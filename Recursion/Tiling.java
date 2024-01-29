package Recursion;

public class Tiling {
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }

    public static int tiling(int n) {
        if (n == 0 || n == 1)
            return 1;

        int verticals = tiling(n - 1);
        int horizontals = tiling(n - 2);
        
        int totWays = verticals + horizontals;
        return totWays;
    }
}
