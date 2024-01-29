public class BinaryTODecimal {
    public static void main(String[] args) {
        binToDec(1011);
    }

    public static void binToDec(int n) {
        int bin = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + bin + " = " + dec);
    }
}
