public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Java program to print different star patterns");
        int i,j;
        for(i=1;i<=8;i++){//rows
            for(j=1;j<=8;j++){//columns
                System.out.print('*');
            }
            System.out.print("\n");
        }

        System.out.println("Second Pattern");
        for(i=1;i<=5;i++){//rows
            for(j=1;j<=5;j++){//columns
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
