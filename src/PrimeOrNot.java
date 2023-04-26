import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to find a number is prime or not");
        int n, count = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
