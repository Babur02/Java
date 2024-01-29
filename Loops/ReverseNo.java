package Loops;

public class ReverseNo {
    public static void main(String[] args) {
        int n = 2431;
        int rev = 0;
        while (n > 0) {
            // int lastDigit=n%10;
            // System.out.print(lastDigit);
            // n=n/10;
            int lastDigit = n % 10; // to get lastDigit
            rev = (rev * 10) + lastDigit;
            n = n / 10; // to remove lastDigit
        }
        System.out.print(rev);
    }
}
