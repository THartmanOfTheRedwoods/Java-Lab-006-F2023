import java.util.Scanner;
/**
 * Steven Fraga, 10/7/23
 */
public class Lab006 {
    int n, m;

    /**
     * Constructer class Lab006 takes 2 integers, and assigns them to Lab006 instance variable
     */
    public Lab006 (int n,int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Tests whether first integer "n" is evenly divisible by second integer "m"
     * @param n first integer input
     * @param m second integer input
     * @return true if n is evenly divisible, false otherwise
     */
    public static boolean isDivisible (int n, int m) {
        return n % m == 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstInteger = s.nextInt();
        System.out.println("Enter the second integer: ");
        int secondInteger = s.nextInt();
        Lab006 labTest = new Lab006(firstInteger, secondInteger);
        System.out.println(isDivisible(labTest.n, labTest.m));
    }
}
