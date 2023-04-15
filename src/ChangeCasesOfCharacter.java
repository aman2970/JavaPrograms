import java.util.Scanner;

public class ChangeCasesOfCharacter {
    public static void main(String[] args) {
        System.out.println("Java program to change the cases of character");

        char ch,ch2;
        System.out.println("Enter any Character");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        if(ch>='A' && ch<='Z'){
           ch2 =  Character.toLowerCase(ch);
            System.out.println("Lowercase" + ch2);
        }else{
            ch2 =  Character.toUpperCase(ch);
            System.out.println("Uppercase" + ch2);
        }
    }
}
