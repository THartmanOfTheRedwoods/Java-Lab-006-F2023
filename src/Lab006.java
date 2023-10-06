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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me one integer");
        String x = scanner.nextLine();
        System.out.println("Give me a second integer");
        String y = scanner.nextLine();

        Lab006 L = new Lab006(x, y);
        L.isDivisible();

        public static int parseInt(String"x", String"y");
        int = Integer.parseInt(String "x");
        int = Integer.parseInt(y);

    }

}