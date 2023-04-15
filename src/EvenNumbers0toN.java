import java.util.Scanner;

public class EvenNumbers0toN {
    public static void main(String[] args) {
        System.out.println("Even numbers between 0 to N");
        System.out.println("Enter number of term");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=0; i<=n; i=i+2)
        {
            System.out.println(i);
        }
    }
}
