package Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }

    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnp1 = pairing(n - 1);
        int fnp2 = (n - 1) * pairing(n - 2);

        int totWays = fnp1 + fnp2;
        return totWays;
        // return pairing(n - 1) + (n - 1) * pairing(n - 2);
        // // Single Pair
    }
}
