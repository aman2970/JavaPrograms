import java.util.Scanner;

public class TaxOfSalary {
    public static void main(String[] args) {
        System.out.println("Java Program to calculate tax of salary");
        int salary;
        double tax;
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextInt();

        if(salary<=10000){
            System.out.println(salary + "No Tax");
        }else if(salary>10000 && salary<=100000){
            tax = salary*0.10;
            System.out.println(salary + " " + tax);
        }else{
            tax = salary*0.20;
            System.out.println(salary + " " + tax);
        }

    }
}
