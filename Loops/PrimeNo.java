package Loops;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();

        int isPrime = 0;
        for (int i = 2; i<=n/2; i++) {   // <n, <=n/2
            if (n % i == 0) // n is multiple of i(i!=1 or n)
                isPrime = 1;
                break;
        }

        if (isPrime==0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
