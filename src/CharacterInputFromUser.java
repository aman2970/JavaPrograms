import java.util.Scanner;

public class CharacterInputFromUser {
    public static void main(String[] args) {
        System.out.println("Character input from user");
        char ch;

        System.out.println("Please enter character");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        System.out.println(ch);

    }
}
