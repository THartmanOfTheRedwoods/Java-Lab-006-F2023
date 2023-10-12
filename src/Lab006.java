/**
 * Lab006 class.
 * This class prompts the user for two integers and checks if the first integer is evenly divisible by the second integer.
 *
 * Justin Hart
 * @version 1.0
 */




import java.util.Scanner;

public class Lab006 {
    int n; // instance variable n
    int m; // instance variable m

    // constructor
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // method to check divisibility
    public boolean isDivisible() {
        return (m != 0 && n % m == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int n = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int m = scanner.nextInt();

        Lab006 obj = new Lab006(n, m);
        boolean result = obj.isDivisible();

        System.out.println("Is " + n + " evenly divisible by " + m + "? " + result);
    }
}





