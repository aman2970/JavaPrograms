import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to check if a number is armstrong or not");
        int n,rem,arm=0,c;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c=n;
        while (n>0){
            rem = n%10;
           arm =  (rem*rem*rem)+arm;
           n=n/10;
        }

        if(c==arm){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }

    }
}
