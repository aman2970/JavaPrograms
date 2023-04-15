import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Java program to reverse a  number");
        int n,r;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n>0){
            r = n%10;
            System.out.println("Reverse Order" + r);
            n=n/10;

        }



    }
}
