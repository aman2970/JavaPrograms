import java.util.Scanner;

public class FibonacciSeriesProgram {
    public static void main(String[] args) {
        System.out.println("Java program to print fibonacci series");
        int term,a=0;
        int b=1;
        int c;
        System.out.println("Enter term");
        Scanner scanner = new Scanner(System.in);
        term = scanner.nextInt();
        for(int i=1;i<=term;i++){
            System.out.println(a);
            c =a +b;
            a =b;
            b = c;
        }

    }
}
