import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Java program to find sum of digits");
        int n,r,sum = 0;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();

        while (n>0){
            r = n%10;
            sum = sum +r;
            n = n/10;
        }
        System.out.println("Sum of Digits" + sum);
    }
}
