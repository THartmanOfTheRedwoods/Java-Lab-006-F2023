/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public boolean isDivisible() {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give me an integer");
        int x = Integer.parseInt(s.nextLine());

        System.out.println("Would you mind giving me a second integer");
        int y = Integer.parseInt(s.nextLine());

        Lab006 labObject = new Lab006(x, y);
        boolean result = labObject.isDivisible();

        if (result) {
            System.out.println("The first integer is divisible by the second integer.");
        } else {
            System.out.println("The first integer is not divisible by the second integer.");
        }
    }
}
