import java.util.Scanner;

public class DayNameOfWeekend {
    public static void main(String[] args) {
        System.out.println("Java program to print day of the week");
        int n;
        System.out.println("Enter code of day");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        switch (n)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Code");
                break;

        }
    }
}
