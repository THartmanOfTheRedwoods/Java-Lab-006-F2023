import java.util.Scanner;
/**
 * @author Skyler
 * Lab 006 assignment completed 10/25/23
 */
public class Lab006 {
    private int n;
    private int m;
    private static final Scanner input = new Scanner(System.in);

    /**
     * Tests whether a digit is divisible by another
     * @return true if n is evenly divisible by m, false if otherwise
     */
    public boolean isDivisible(){
        return n % m == 0;
    }

    /**
     * Constructor method that assigns two input variables to instance variables
     * @param n dividend input
     * @param m divisor input
     */
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

    public static void main(String[] args) {
        System.out.print("Please enter a dividend: ");
        int x = Integer.parseInt(input.nextLine());

        System.out.print("Please enter a divisor: ");
        int y = Integer.parseInt(input.nextLine());

        Lab006 lab = new Lab006(x,y);
        System.out.println("Is " + x + " divisible by " + y + "?\n" + lab.isDivisible());
    }
}
