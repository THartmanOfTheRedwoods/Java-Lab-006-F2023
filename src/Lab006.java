import java.util.Scanner;

public class Lab006 {

    int n;

    int m;


    // n The first integer value.
    // m The second integer value.

    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // check if n is divisable by m

    public boolean isDivisble(){
        return (n % m) == 0;

    }
    // main method which handles getting the user input and displaying the result
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        number1 = scan.nextInt();
        System.out.println("Enter the integer: ");
        number2 = scan.nextInt();
        Lab006 labObject = new Lab006(number1, number2);

        boolean result  = labObject.isDivisble();
        if (result){
            System.out.println(number1 + " is evenly divisible by " + number2);
        }
        else {
            System.out.println(number1 + " is not evenly divisible by " + number2);
        }

    }






}
