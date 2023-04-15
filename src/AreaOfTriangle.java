import java.util.Scanner;


public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Java program to calculate area of triangle");
        int a,b,c,s,area;
        System.out.println("Enter sides of triangle");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        s = (a+b+c)/2;

        area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is" + area);


    }
}
