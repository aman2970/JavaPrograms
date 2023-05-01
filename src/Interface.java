import java.util.Scanner;

public interface Interface
{

    void input();  //public+abstract
    void output(); //public+abstract

}
class Raju implements Interface
{
    String name; double sal;
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = scanner.nextLine();
        sal = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        Interface i = new Raju();
        i.input();
        i.output();
    }
}
