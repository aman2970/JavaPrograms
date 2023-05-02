public class VarArg {
    void add(int ...a)
    {
        int sum=0;
        for(int x:a)
        {
            sum=sum+x;
        }
        System.out.println("Sum of Numbers"+sum);
    }
}
class Demo
{
    public static void main(String[] args) {
        VarArg r = new VarArg();
        r.add();
        r.add(10);
        r.add(10,20);
        r.add(10,20,30);
    }
}