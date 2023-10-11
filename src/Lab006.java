public class Lab006 {

    private final int n;
    private final int m;

    /**
     * Constructs a Lab006 object
     * @author Atticus Blanco
     * @param n value assigned to the instance variable (n)
     * @param m value assigned to the instance variable (m)
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Determines if variable (n) is divisible by variable (m)
     * @author Atticus Blanco
     * @return {@code true} if n is divisible by m, else returns {@code false}
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * Prints to terminal the divisibility of two numbers
     * @author Atticus Blanco
     * @see #isDivisible()
     */
    public void printToTerminal(){
        if (isDivisible()) {
            System.out.println("Divisible");
        } else if (!(isDivisible())) {
            System.out.println("Not Divisible");
        }
    }
}