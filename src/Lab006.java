/*Finn Clark
* CIS - 12
* Hartman
* 10/5/23
*  */
import java.util.Scanner;

public class Lab006 {
    final private int  n;
    final private int m;
    public int quotient;
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

    /**Setting the n%m quotient to the public instance variable "quotient"
     * No parameters
     * @return boolean true if divisible or false if not
     */
    public boolean isDivisible(){
        this.quotient = n%m;
        if (quotient == 0){
            System.out.println("You're numbers are divisible! :D");
            return true;
        } else {
            System.out.println("Your numbers are indivisible :(");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int x = scanner.nextInt();
        System.out.println("Give me another integer: ");
        int y = scanner.nextInt();
        Lab006 lab = new Lab006(x, y);
        lab.isDivisible();
    }


}
