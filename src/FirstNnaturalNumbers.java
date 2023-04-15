import java.util.Scanner;

public class FirstNnaturalNumbers {
    public static void main(String args[]){
        int n;
        System.out.println("Enter number of turn");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i + " ");
        }

    }
}
