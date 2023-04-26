import java.util.Scanner;

public class LengthOfArray {
    public static void main(String[] args) {
        System.out.println("Java program to find the length of array");

        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(int i=0; i<5; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("Array elements");

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }

        System.out.println("Array length" + a.length);





    }
}
