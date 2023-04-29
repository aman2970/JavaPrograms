import java.util.Scanner;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        System.out.println("Java program to add two matrix");
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first matrix data");
        for (int i = 0; i < 2; i++) { //rows

            for (int j = 0; j < 2; j++) { //columns
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter second matrix data");
        for (int i = 0; i < 2; i++) { //rows

            for (int j = 0; j < 2; j++) { //columns
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First Matrix");
        for (int i = 0; i < 2; i++) { //rows

            for (int j = 0; j < 2; j++) { //columns
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }


        System.out.println("Second Matrix");
        for (int i = 0; i < 2; i++) { //rows

            for (int j = 0; j < 2; j++) { //columns
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Sum of two matrix");
        for (int i = 0; i < 2; i++) { //rows

            for (int j = 0; j < 2; j++) { //columns
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }



    }
}
