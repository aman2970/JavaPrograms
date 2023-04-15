import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Java program to calculate area of circle");
        final double pi = 3.14,area;
        int r;
        System.out.println("Enter radius of circle");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();

        area = pi * r * r;
        System.out.println("Area of circle is" + area);
    }
}
