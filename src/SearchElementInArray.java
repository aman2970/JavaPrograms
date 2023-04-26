import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        System.out.println("Java program to search an element in array");
        int a[] = new int[5];
        int n, count = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter search element");
        n = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Item Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
