public class StarPatternPrograms {
    public static void main(String[] args) {
        System.out.println("Java program to print star patterns");
        int i, j, k;
        for (i = 1; i <= 5; i++) { //rows
            for (j = 1; j <= i; j++) { //columns
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //Second Pattern
        System.out.println("Second Pattern");
        for (i = 1; i <= 5; i++) { //rows
            for (j = 5; j >= i; j--) { //columns
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Third Pattern
        System.out.println("Third Pattern");
        for (i = 1; i <= 5; i++) { //rows
            for (j =i; j <5 ; j++) { //space
                System.out.print(" ");
            }
            for (k = 1; k<=i ; k++) { //column
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Fourth Pattern
        System.out.println("Fourth Pattern");
        for (i = 1; i <= 5; i++) { //rows
            for (j =1; j <i ; j++) { //space
                System.out.print(" ");
            }
            for (k = i; k<=5 ; k++) { //column
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
