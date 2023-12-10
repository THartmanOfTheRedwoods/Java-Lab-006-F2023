/*
*
* @author Trevor Hartman
* @author Angelina Perez
*
*/
import java.util.Scanner;
public class Lab006 {
    //two integer instance variables
    private int n;
    private int m;

    /**
     * create a constructor
     * @param n
     * @param m
     */

    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     *
     * @return returns true if n is evenly divisible by m, and false otherwise.
     */

    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * n a static main method, prompt the user for two integers and store those values into local variables.
     * Use the local variables as the arguments to the Lab006 constructor when creating a new Lab006 object.
     * Call isDivisible using a Lab006 object, and be sure to have code that "handles" the returned value from isDivisible
     * se a print command to display an appropriate label and the result of isDivisible.
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number(n):");
        int n = scanner.nextInt();
        System.out.println("Enter second number(m):");
        int m = scanner.nextInt();
        Lab006 lab = new Lab006(n, m);
        if (lab.isDivisible()) {
            System.out.printf("%s is divisible by %s.", n, m);
        } else {
            System.out.printf("%s is not divisible by %s.", n, m);


        }
    }
}