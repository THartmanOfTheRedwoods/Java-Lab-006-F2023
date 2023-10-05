/**
 * Ethan Jauernig 10/5/23
 * Lab006(int n, int m):
 * This is the constructor method of the class Lab006.
 * It takes two parameters: n and m, which are both of type int.
 *
 *
 * isDivisible():
 * This is an instance method of the class Lab006.
 * It does not take any parameters.
 * It returns a boolean value that indicates whether the instance variable n is evenly divisible by the instance variable m.
 *
 *
 * main(String[] args):
 * This is the main method of the class Lab006.
 * It takes one parameter: args, which is an array of type String.
 *
 *
 * nextInt(): This is a method of the class Scanner. It takes no parameters.
 *
 * Parameters:
 * n,m,args
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
            return n % m == 0;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int n = in.nextInt();
            int m = in.nextInt();
            in.close();

            Lab006 lab = new Lab006(n, m);
            boolean result = lab.isDivisible();

            System.out.println("Is " + n + " evenly divisible by " + m + "? " + result);
        }
    }

