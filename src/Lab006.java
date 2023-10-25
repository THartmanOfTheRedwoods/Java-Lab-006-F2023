import java.util.Scanner;

/**
 * @author Olivia McKittrick
 * class 006 uses two integer instance variables n & m
 * then it checks if n is divisible by m
 * asks the user to enter a variable and prints whether n is divisisble by m
 */
public class Lab006 {
    private final int n; // integer instance 1
    private final int m; // integer instance 2

    public Lab006(int n, int m) { // Constructor that takes two integers as parameters
        this.n = n; // Assigning value n parameter to n instance variable
        this.m = m; // Assigning value m parameter to m instance variable
    }

    public boolean isDivisible() { // Method that checks if n is evenly divisible by m
        if (m == 0) {
            return false;
        }
        return n % m == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (n): "); // Prompt the user for integer 1
        int userN = scanner.nextInt(); // Storing in local variable

        System.out.print("Enter the second integer (m): "); // Prompt the user for integer 2
        int userM = scanner.nextInt(); // Storing in local variable

        Lab006 labObject = new Lab006(userN, userM); // Created lab object with user values

        boolean result = labObject.isDivisible(); // Uses isDivisible with labObject

        if (result) {
            System.out.println(userN + " is evenly divisible by " + userM + ".");
        } else {
            System.out.println(userN + " is not evenly divisible by " + userM + ".");
        }
    }
}
