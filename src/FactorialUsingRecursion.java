import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Java program to find factorial using recursion");
        int n;
        System.out.println("Enter any Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        FactorialUsingRecursion obj = new FactorialUsingRecursion();
        int result = obj.fact(n);
        System.out.println(result);

    }
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }else
        {
            return n*fact(n-1);
        }
    }


}
