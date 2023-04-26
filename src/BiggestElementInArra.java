import java.util.Scanner;

public class BiggestElementInArra {
    public static void main(String[] args) {
        System.out.println("Java program to find biggest element in array");
        int a[] = new int[5];
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i=0; i<5; i++){
            a[i] = scanner.nextInt();
        }

        max = a[0];
        for (int i=1;i<5;i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println("Biggest Element" + max);
    }
}
