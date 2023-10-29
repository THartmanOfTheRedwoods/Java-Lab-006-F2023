/**
 * Author - Joseph Verdin
 * Date - 10/28/23
 */

import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;

    /**
     * Created constructor for class Lab006 that takes two ints and assigns them to the Lab 006 instance variables.
     * @param n 1st integer
     * @param m 2nd integer
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;

    }

    /**
     * Checks if 1st int is able to be evenly divided by the 2nd int
     * @return True if n can be evenly divided by m if not is false
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * Main method that asks user for two integers and uses the isDivisible method to check if they can be evenly divided then prints the answer
     * @param args no arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Integer 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Integer 2: ");
        int num2 = scanner.nextInt();

        Lab006 Labobj = new Lab006(num1, num2);

        boolean result = Labobj.isDivisible();
        if (result) {
            System.out.println(num1 + " Can be evenly divided by " + num2);
        } else {
            System.out.println(num1 + " Can not be evenly divided by " + num2);
        }


    }
}
