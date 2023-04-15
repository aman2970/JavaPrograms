import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Java program to make a calculator");
        int n1,n2,ch,cal;
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
         n1 = scanner.nextInt();
         n2 = scanner.nextInt();
        System.out.println("Select Operation");
        ch = scanner.nextInt();

        if(ch == 1){
            cal = n1+n2;
            System.out.println("ADDITION IS" + cal);
        } else if (ch == 2) {
            cal = n1-n2;
            System.out.println("SUBTRACTION IS" + cal);
        }else if (ch == 3){
            cal = n1*n2;
            System.out.println("MULTIPLICATION IS" + cal);
        } else if (ch == 4) {
            cal = n1/n2;
            System.out.println("DIVISION IS" + cal);
        } else{
            cal = n1%n2;
            System.out.println("REMAINDER IS" + cal);
        }

    }

}
