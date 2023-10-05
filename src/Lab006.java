/**
 * @author Taylor Christie
 * @date 10/5/2023
 */

import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;

    /**
     * Lab006 Constructor
     * @param user1 First integer inputted by user
     * @param user2 Second integer inputted by user
     */
    public Lab006(int user1, int user2) {
        this.n = user1;
        this.m = user2;
    }

    /**
     * Takes the inputted integers and checks if they're evenly divisible
     * @return true or false
     */
    public boolean isDivisible() {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Prompts user for integers and calls the isDivisible method
     * @param args
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your first integer: ");
        int user1 = scan.nextInt();
        System.out.println("Type in the number you wish to divide the first integer by: ");
        int user2 = scan.nextInt();
        Lab006 name = new Lab006(user1, user2);
        boolean divisible = name.isDivisible();
        System.out.println("The integers were evenly divisible - " + divisible);
    }
}
