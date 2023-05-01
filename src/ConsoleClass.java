import java.io.*;

public class ConsoleClass {
    public static void main(String[] args) {
        System.out.println("Java program for console class");
        String str;char ch[];
        Console obj = System.console();
        System.out.println("Enter Username:");
        str = obj.readLine();
        System.out.println("Enter Password:");
        ch = obj.readPassword();
        String a =  String.valueOf(ch);

        System.out.println("Username:" + str);
        System.out.println("Password:"+a);
    }
}
