public class CheckOddEven {
    public static void main(String[] args) {
        check(0);
        check(1);
        check(2);
        check(3);
    }

    public static void check(int n) {
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// Odd LSB=1
// Even LSB=0