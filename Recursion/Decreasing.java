package Recursion;

public class Decreasing {
    public static void main(String[] args) {
        int n = 10;
        dec(n);
    }

    public static void dec(int n) {
        if (n == 0) 
            return;
        System.out.print(n + " ");
        dec(n-1);
    }
}
