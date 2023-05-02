public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Java program for demonstration of throws keyword");

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
