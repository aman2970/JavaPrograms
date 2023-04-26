import java.util.Scanner;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        System.out.println("Java program to copy one array elements into another");

        int a[] = new int[5];
        int b[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value in first array");
        for(int i=0; i<5; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("First array elements");
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }

        System.out.println("Second array elements");

        for(int i=0; i<5;i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }

    }
}
