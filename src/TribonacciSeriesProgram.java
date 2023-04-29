import java.util.Scanner;

public class TribonacciSeriesProgram {
    public static void main(String[] args) {
        System.out.println("java program to print tribonacci series");
        int a=0;
        int b=1;
        int c=2;
        int d,term;
        System.out.println("Enter term");
        Scanner scanner = new Scanner(System.in);
        term = scanner.nextInt();
        for(int i=1;i<=term;i++){
            System.out.println(a);
            d=a+b+c;
            a=b;
            b=c;
            c=d;

        }
    }

}
