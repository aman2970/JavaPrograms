import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to check if entered year is leap year or not");
        int y;
        System.out.println("Enter any year");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
