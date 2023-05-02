import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        System.out.println("Java program for file handling");

        File f = new File("C:\\Users\\AMAN\\OneDrive\\Desktop\\FileHandling.txt");
        try {
            if(f.createNewFile())
            {
                System.out.println("File Successfully create");
            }else{
                System.out.println("File Already Exist...");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
