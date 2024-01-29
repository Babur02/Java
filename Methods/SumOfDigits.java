public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12));
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
}
