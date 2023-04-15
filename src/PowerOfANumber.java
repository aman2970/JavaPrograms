import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println("Java program to calculate power of a number");
        int n,p,result=1;
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Enter power");
        p = scanner.nextInt();

        for(int i=1; i<=p; i++){
            result = n*result;
        }

        System.out.println("Power is" + result);






    }
}
