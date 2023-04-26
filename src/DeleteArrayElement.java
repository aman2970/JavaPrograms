import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        System.out.println("Java program to delete array  elements");
        int size, loc, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        size = scanner.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array Elements");
        for (i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter Array Location");
        loc = scanner.nextInt();

        for (i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        for (i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
