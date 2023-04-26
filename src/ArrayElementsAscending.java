import java.util.Scanner;

public class ArrayElementsAscending {
    public static void main(String[] args) {
        System.out.println("Java program to arrange array elements in ascending order");
        int a[] = new int[5];
        int temp;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5;  i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<5; i++){
            for(int j=i+1;j<5;j++){
                if(a[i] >a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
    }
}
