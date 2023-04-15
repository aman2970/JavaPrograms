import java.util.Scanner;

public class DivisibleByFiveOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to check if number is divisible by 5 or not");
        int n;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n%5==0){
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Not divisible by 5");
        }
    }
}
