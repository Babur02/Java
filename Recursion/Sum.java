package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        int sum = n + sum(n - 1);
        return sum;
    }
}
