import java.util.Scanner;

public class NumberPerfectOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to find a number is perfect or not");
        int n,sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1; i<n; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(n == sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }


    }
}
