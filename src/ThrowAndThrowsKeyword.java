public class ThrowAndThrowsKeyword {
    void div(int a,int b)throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        System.out.println("Java program for demo of throw and throws keyword");
        ThrowAndThrowsKeyword throwAndThrowsKeyword = new ThrowAndThrowsKeyword();
        try {
            throwAndThrowsKeyword.div(20,0);
        }
        catch (Exception e)
        {
            System.out.println("Value of b is zero");
        }
    }
}
