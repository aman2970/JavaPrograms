public class HalfDiamondPattern {
    public static void main(String[] args) {
        System.out.println("Java program to print half diamond pattern");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (i = 1; i <= 4; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
