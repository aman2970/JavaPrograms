import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Java program to check if entered number is positive or negative ");

        int n;
        System.out.println("Enter any Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }else if(n<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Neither positive nor negative");
        }
    }
}
