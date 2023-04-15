import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Java program to find factor of a number");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<=n;i++ ){
            if(n%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
