public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("Java program print different number patterns");

        int  i,j,count=0;

        System.out.println("First Pattern");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println("Second Pattern");

        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }


    }
}
