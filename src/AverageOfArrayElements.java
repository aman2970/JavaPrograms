import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Java program to find average of array elements");

        int a[] = new int[5];
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5;i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("Addition of array elements");
        for(int i=0; i<a.length;i++){
            sum = a[i] + sum;
        }

        System.out.println("Addition of array elements is" + sum);
        System.out.println("Average of array elements is " + sum /a.length);

    }
}
