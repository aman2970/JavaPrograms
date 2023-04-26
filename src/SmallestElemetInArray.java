import java.util.Scanner;

public class SmallestElemetInArray {
    public static void main(String[] args) {
        System.out.println("Java program to find smallest element in array");
        int a[] = new int[5];
        int min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Smallest" + min);

    }
}
