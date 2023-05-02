
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        System.out.println("Java program to read from file");
        try
        {
            FileReader r = new FileReader("C:\\Users\\AMAN\\OneDrive\\Desktop\\FileHandling.txt");
            try {
                int i;
                while ((i=r.read()) !=-1)
                {
                    System.out.print((char) i);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                r.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
