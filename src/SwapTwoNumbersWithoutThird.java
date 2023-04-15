import java.util.Scanner;

public class SwapTwoNumbersWithoutThird {
    public static void main(String[] args) {
        System.out.println("Java program to swap two numbers without using third variable");
        int a,b;

        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Before Swapping" +a+ " " + b);
        a= a+b;
        b= a-b;
        a =a -b;

        System.out.println("After Swapping"+a+" "+b);

    }
}
