import java.util.Scanner;

public class Lab006 {
    private int n;
    private int m;

    /**
     * This constructor assigns the m to be x and the n to be y.
     * @param x Dividend / (for Syl) Numerator
     * @param y Divisor / (for Syl) Denominator
     */
    public Lab006(int x, int y) {
        this.m = x;
        this.n = y;

    }

    /**
     * This method will return true if the first entered
     * integer IS divisible by the second entered integer
      * @return
     */
    public boolean isDivisible() {
        return m % n == 0;
    }

    /**
     * This main method asks for an integer, stores
     * that integer into x, asks for a second integer, stores
     * that integer into y, then plugs the entered values into
     * isDivisible which will test to see if the x is divisible
     * by the y. If this returns true, it will print "x is divisible by y"
     * If x is not divisible by y, then it will print "x is not divisible by y"
     *
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Enter your first integer");
        int x = s.nextInt();
        System.out.println("Enter your second integer");
        int y = s.nextInt();

        Lab006 obj = new Lab006(x, y);

        if (obj.isDivisible()) {
            System.out.printf(x + " is divisible by " + y);
        } else {
            System.out.printf(x + " is not divisible by " + y);
        }
    }
}
