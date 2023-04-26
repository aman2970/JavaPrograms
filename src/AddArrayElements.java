import java.util.Scanner;

public class AddArrayElements {
    public static void main(String[] args) {
        System.out.println("Java program to add array elements ");
        int a[] = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(int i=0; i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
            sum = a[i] + sum;
        }
        System.out.println("ADDITION OF ARRAY ELEMENTS" + sum);

    }
}
