import java.util.Scanner;

/**this is a program to tell whether two numbers are evenly disible.**/
public class Lab006 {

    int n;
    int m;

    /**here is the constructor assigning the instance variable**/
    public Lab006(int n, int m){
        this.n =n;
        this.m =m;

    }

    /**the method returning whether or not two numbers are divisible**/
    public boolean isDivisible(){
        if(n%m==0){
            return true;
        }else
            return false;

    }
/**main method requesting user input and executing the isDivisible method**/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("input second number");
        int b = input.nextInt();

        Lab006 obj = new Lab006(a, b);
        boolean divisible = obj.isDivisible();

        if(divisible) {
            System.out.println("yes the numbers are divisible");
        }else{
            System.out.println("no the numbers are not divisible");
        }
    }

}
