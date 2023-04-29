import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println("Java program to print transpose of a matrix");
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("Enter Array Data");
        for(int i=0; i<=1;i++){
            for(int j=0;j<=1;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array Matrix");
        for(int i=0; i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Transpose Matrix");
        for(int i=0; i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }



    }
}
