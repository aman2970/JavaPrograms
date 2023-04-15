import java.util.Scanner;

public class TotalAverageMarksOfFiveSubjects {
    public static void main(String[] args) {
        System.out.println("Java program to find the total and average marks of five subjects");

        int a,b,c,d,e,sum;
        System.out.println("Enter marks of five subjects");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();

        sum = a + b + c + d + e;
        System.out.println("Total marks" + sum);

        double avg = sum /5.0;

        System.out.println ("Average marks" + avg);
    }







}
