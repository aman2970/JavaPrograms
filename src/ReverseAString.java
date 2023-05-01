import static java.util.Collections.reverse;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Java program to reverse a string");
        StringBuffer stringBuffer = new StringBuffer("Learn Aman");
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder("Aman Singh");
        System.out.println(stringBuilder.reverse());

        int l;
        String r = "Java Programming";
        String r2="";
        l=r.length();

        for(int i=l-1;i>0;i--)
        {
           r2 = r2 +  r.charAt(i);

        }
        System.out.println(r2);


    }
}
