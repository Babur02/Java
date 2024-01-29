package Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "x" + i + "=" + n * i);
            System.out.println();
        }
    }
}
