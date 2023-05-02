import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        System.out.println("Java program to write into a file");

        FileWriter f = null;
        try {
            f = new FileWriter("C:\\Users\\AMAN\\OneDrive\\Desktop\\FileHandling.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try
        {
            f.write("Java programming is best language");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                f.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Successfully data wrote in file");

    }
}
