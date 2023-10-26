import java.util.Scanner;
public class Lab006 {
    private int n;
    private int m;
    public Lab006(int userN, int userM) {
        this.n = userN;
        this.m = userM;
    }
    public boolean isDivisible () {
        return n % m == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type in a number and press enter:");
        int userN = in.nextInt();
        System.out.println("Please type in another number and press enter:");
        int userM = in.nextInt();
        Lab006 lab6 = new Lab006(userN, userM);
        if (lab6.isDivisible()){
            System.out.printf("%s is divisible by %s.", userN, userM);
        } else {
            System.out.printf("%s is not divisible by %s.", userN, userM);
    }
    }
    }