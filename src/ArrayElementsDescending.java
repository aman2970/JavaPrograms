import java.util.Scanner;

public class ArrayElementsDescending {
    public static void main(String[] args) {
        System.out.println("Java program to arrange array elements in descending order");

        int a[] = new int[5];
        int temp;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<a.length;i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
