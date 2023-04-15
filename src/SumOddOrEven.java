import java.util.Scanner;

public class SumOddOrEven {
    public static void main(String[] args) {
        System.out.println("Program for sum of odd or even numbers");
        int n,i,sum =0;
        System.out.println("Enter range");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n%2 == 0)
        {
            for(i=0;i<=n;i=i+2)
            {
                sum = sum +i;
            }
            System.out.println("Sum of Even number " + sum);

        }else
        {
            for(i=1;i<=n;i=i+2)
            {
                sum = sum + i;
            }
            System.out.println("Sum of odd number " + sum);
        }
    }
}
