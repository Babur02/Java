public class DecimalToBinary {
    public static void main(String[] args) {
        decToBin(7);
    }

    public static void decToBin(int n) {
        int dec = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int lastDigit = n % 2;
            bin = bin + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + dec + " = " + bin);
    }
}
