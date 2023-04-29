import java.util.Scanner;
import java.util.SortedMap;

public class MatrixUsing2DArray {
    public static void main(String[] args) {
        System.out.println("Java program to print matrix using 2D Array");
        int a[][] = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix: \n");
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
}
