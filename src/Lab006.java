//Miaka LaRose 10/27
import java.util.Scanner;

/**
 * class
 */
public class Lab006 {

    public static int n;
    /**
     * creating n
     */
    public static int m;
    /**
     * creating m
     */
   public static Scanner s = new Scanner(System.in);
    /**
     * allows user to input a value
     */
    public Lab006(){
int u = m;
int w = n;

    }
    /**
     * useless?
     */

    public static boolean isDivisible(){

if(m % n == 0 ){

    return true;
}else{
    return false;
}
        /**
         * returns true or false baised on if n is divisible by m
         * @return
         */
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){

System.out.println("Input any number of your choosing for the n");
        n = s.nextInt();
System.out.println("Input any number of your choosing for the m");
        m = s.nextInt();
System.out.print(isDivisible());
    }

}
