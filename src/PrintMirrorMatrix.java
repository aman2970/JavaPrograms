import java.util.Scanner;

public class PrintMirrorMatrix {
    public static void main(String[] args) {
        System.out.println("Java program to print mirror matrix");
        int a[][] = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Data");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array Matrix:");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Mirror Matrix:");
        for(int i=0;i<=1;i++){
            for(int j=1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
}
