import java.util.Scanner;

public class Main {

    /**
     * Prompts user for a dividend and divisor, stores the results to local variables.
     * Lab006 object is created to test divisibility of local variables, and then print results.
     * @author Atticus Blanco
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Pick a dividend: ");
        int dividend = Integer.parseInt(s.nextLine());
        System.out.println("Pick a divisor: ");
        int divisor = Integer.parseInt(s.nextLine());

        Lab006 lab006 = new Lab006(dividend, divisor);
        lab006.isDivisible();
        lab006.printToTerminal();
    }
}
