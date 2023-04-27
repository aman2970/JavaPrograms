public class CharacterPatternPrograms {
    public static void main(String[] args) {
        System.out.println("Java program to print different character pattern programs");
        char i,j;
        System.out.println("First Pattern");
        for(i='A';i<='E';i++){
            for(j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println("Second Pattern");
        for(i='A';i<='E';i++){
            for(j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
