public class PrimeRange {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(countPrime(10));
        primeInRange(50);
    }

    // public static boolean isPrime(int n) {
    //     if (n <= 1)
    //         return false;
    //     boolean isPrime = true;
    //     for (int i = 2; i <= Math.sqrt(n); i++) { // <n, <=n/2
    //         if (n % i == 0) // n is multiple of i(i!=1 or n)
    //             return false;
    //         break;
    //     }
    //     return true;
    // }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) { 
            if (n % i == 0) 
                return false;
            break;
        }
        return true;
    }

    private static int countPrime(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) // True
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
