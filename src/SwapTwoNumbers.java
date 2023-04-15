import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Java program to swap two numbers");

        int a,b,temp;
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Before swapping" + a + " " +b);

        temp = a;

        a=b;

        b= temp;

        System.out.println("After swapping" + a + " "+b);







    }
}
