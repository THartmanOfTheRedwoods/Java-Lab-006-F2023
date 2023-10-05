import java.util.Scanner;

public class Lab006 {
    private int n;
    private int m;
    public int quotient;
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }
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
        System.out.print(lab.quotient);
    }


}
