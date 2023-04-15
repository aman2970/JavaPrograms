import java.util.Scanner;

public class OddNumbers1toN {
    public static void main(String[] args) {
        System.out.println("Printing all odd numbers between 1 to N ");
        System.out.println("Enter number of term");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<=n; i=i+2)
        {
            System.out.println(i);
        }

    }
}
