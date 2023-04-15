import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Java program to calculate area of rectangle");
         int l,b,area;
        System.out.println("Enter value for sides");
        Scanner scanner = new Scanner(System.in);
        l =scanner.nextInt();
        b = scanner.nextInt();
        area = l*b;

        System.out.println("Are of rectangle" + area);
    }
}
