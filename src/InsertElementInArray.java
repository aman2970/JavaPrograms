import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        System.out.println("Java program to insert new elements in array");
        int size,loc,item,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        size = scanner.nextInt();

        int a[] = new int[size+1];
        System.out.println("Enter Array Elements");
        for(i=0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter Array Location");
        loc = scanner.nextInt();
        System.out.println("Enter new item");
        item = scanner.nextInt();

        for (i =size;i>loc;i++){
            a[i] = a[i-1];
        }

        a[loc] = item;
        size++;
        for (i=0;i<size;i++){
            System.out.println(a[i]);
        }





    }
}
