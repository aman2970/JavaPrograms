public class PrintArrayElements {
    public static void main(String[] args) {
        System.out.println("Java program to print elements of array");
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for(int i=0;  i<3; i++){
            System.out.println(a[i]);
        }

        for(int b:a)
        {
            System.out.println(b);
        }
    }
}
