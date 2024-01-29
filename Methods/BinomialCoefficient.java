public class BinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(bc(5, 2));
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bc(int n, int r) {
        int fn = factorial(n);
        int fr = factorial(r);
        int nmr = factorial(n - r);
        int bc = fn / (fr * nmr);
        return bc;
    }
}
