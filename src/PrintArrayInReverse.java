import java.util.Scanner;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        System.out.println("Print array elements in reverse");

        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in array");

        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }


    }
}
