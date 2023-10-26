import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */
public class Lab006 {
    private int n;
    private int m;

    private static Scanner s = new Scanner(System.in);

    /**
     * Constructor to assign n to n and m to m
     * @param n This will be dividend in our program
     * @param m This will ge the divisor in our program
     */
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

    /**
     * Method to determine if "n" is evenly divisible by "m"
     * @return boolean
     */
    public boolean isDivisible(){
        return n % m == 0;
    }

    /**
     * very intricate program with extremely complicated variable naming conventions
     * that takes in two numbers and divides one number by the other, confirms that its
     * does or does not go in evenly and then returns the answer to lives greatest question.
     * @param args not really sure what I am supposed to put here "a string with args?"
     */
    public static void main(String[]args){
        System.out.println("Please enter a number for \"n\"");
        int n = s.nextInt();
        System.out.println("Please enter a number for \"m\"");
        int m = s.nextInt();
        Lab006 oblab006 = new Lab006(n,m);
        if (oblab006.isDivisible()){
            System.out.printf("%d is divisible by %d",n, m);
        } else {
            System.out.printf("%d is not evenly divisible by %d",n, m);
        }

    }
}
