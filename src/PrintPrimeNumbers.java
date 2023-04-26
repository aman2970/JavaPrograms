import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Java program to print all prime numbers between two numbers");
        int n1,n2,i,j;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        for(i=n1;i<=n2;i++){
            for( j=2;j<=i;j++){
                if(i%j ==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(j);
            }
        }
    }
}
