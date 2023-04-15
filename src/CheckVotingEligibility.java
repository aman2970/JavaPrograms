import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        System.out.println("Java program to check voting eligibility");
        int age;
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age >=18){
            System.out.println("You are eligible for votes");
        }else{
            System.out.println("You are not eligible for votes");
        }
    }
}
