
public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(11211);
    }

    public static void isPalindrome(int n) {
        int no=n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10; // to get lastDigit
            rev = (rev * 10) + lastDigit;
            n = n / 10; // to remove lastDigit
        }
        if (rev == no)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
