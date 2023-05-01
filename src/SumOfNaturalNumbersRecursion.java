public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        System.out.println("Java program to find sum of n natural numbers using recursion");
        SumOfNaturalNumbersRecursion sumOfNaturalNumbersRecursion = new SumOfNaturalNumbersRecursion();
        int a = sumOfNaturalNumbersRecursion.sum(3);
        System.out.println(a);


    }
    int sum(int b)
    {
        if(b>0)
        {
            return b+sum(b-1);
        }else
        {
            return 0;
        }
    }

}
