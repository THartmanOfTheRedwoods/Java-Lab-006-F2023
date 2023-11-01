//Naqibullah Haiwadpal
//10/28/2023  n
//Naqibullah Haiwadpal
//10/28/2023

import java.util.Scanner;

/**
 * Lab006 class for performing integer division checks.
 */
public class Lab006 {
    private int n;
    private int m;

    /**
     * Constructor for initializing n and m.
     * @param n The first integer.
     * @param m The second integer.
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Check if n is evenly divisible by m.
     * @return True if n is evenly divisible by m, false otherwise.
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the second integer (m): ");
        int m = scanner.nextInt();

        Lab006 lab = new Lab006(n, m);
        boolean result = lab.isDivisible();

        System.out.println(n + " is evenly divisible by " + m + ": " + result);
    }
}

