import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Java program to find factorial of a number");
        System.out.println("Enter any number");
        int n,fact=1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is" + fact);
    }
}
