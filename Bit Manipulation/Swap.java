public class Swap {
    public static void main(String[] args) {
        int x = 2, y = 3;
        System.out.println("Before Swap x = " + x + " y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap x = " + x + " y = " + y);
    }
}
