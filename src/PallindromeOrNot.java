import java.util.Scanner;

public class PallindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to check if entered number is palindrome or not");
        int n,c,r,s=0;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        c = n;
        while (n>0){
           r =  n%10;
           s = (s*10)+r;
           n=n/10;
        }

        if(c == s){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
