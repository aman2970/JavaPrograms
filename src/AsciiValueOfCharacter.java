import java.util.Scanner;

public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        System.out.println("Java program to find the ASCII value of entered character");
        System.out.println("Enter any character");
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        int a = ch;

        System.out.println("ASCII VALUE IS " + a);

    }
}
