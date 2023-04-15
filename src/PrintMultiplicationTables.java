import java.util.Scanner;

public class PrintMultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Java Program to print Multiplication Tables");
        int num;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(num + "*" + i+"=" + num * i);
        }
    }
}
