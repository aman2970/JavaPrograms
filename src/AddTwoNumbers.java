import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String args[]) {
        int a, b,sum;
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = a+b;
        System.out.println("ADDITION" + sum);

    }
}
