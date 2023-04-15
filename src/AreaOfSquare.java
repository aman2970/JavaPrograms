import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.println("Java program to calculate are of square");
        int side,area;
        System.out.println("Enter sides");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();

        area = side * side;

        System.out.println("Area of square is" + area);
    }
}
