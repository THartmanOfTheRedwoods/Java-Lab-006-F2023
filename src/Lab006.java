import java.util.Scanner;

/**
 *
 * @author Cassandra Portlock
 *
 * @since Version 1
 *
 */

public class Lab006 {

    int n;
    int m;

    /**
     * Assigns values to the Class instance variables.
     *
     * @param x is the first number entered
     * @param y is the number x will be divided by
     */
    public Lab006(int x, int y){
        n = x;
        m = y;
    }

    /**
     * Tests whether the variables are divisible evenly or not.
     *
     * @param x the integer to test
     * @return true if the modulus of x = 0
     */
    public boolean isDivisible(int x){
        return x % 2 == 0;
    }

    /**
     * runs the program
     *
     * @param args holds the arguments for the program.
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = Integer.parseInt(s.nextLine());
        System.out.print("Enter a second number: ");
        int number2 = Integer.parseInt(s.nextLine());
        System.out.println();

        Lab006 division =new Lab006(number1, number2);

        if (division.isDivisible(number1/number2)) {
            System.out.printf("%s is divisible by %s evenly.", number1, number2);
        } else {
            System.out.printf("%s is not divisible by %s evenly.", number1, number2);
        }
    }
}