import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        System.out.println("Java program to find square root ofa number");
        int n;
        double m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = Math.sqrt(n);
        System.out.println("Square root of" + n +"is" + m);



    }
}
