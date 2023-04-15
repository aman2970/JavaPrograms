import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        System.out.println("Java program to count the digits of entered number");
        int n,count=0;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Number of Digits" + count);

    }
}
