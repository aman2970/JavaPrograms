import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Program to check entered character is vowel or consonant");
        System.out.println("Please enter a character");
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        if(ch =='a'||ch == 'e'||ch == 'i'||ch == 'o'|| ch == 'u'){
            System.out.println("Entered character is vowel");
        }else {
            System.out.println("Entered character is consonant");
        }
    }
}
