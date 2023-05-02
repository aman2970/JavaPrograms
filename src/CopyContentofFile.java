import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentofFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Java program to copy content of a file into another file");
        FileInputStream r = new FileInputStream("C:\\Users\\AMAN\\OneDrive\\Desktop\\RenamedFile.txt");

        FileOutputStream w = new FileOutputStream("C:\\Users\\AMAN\\OneDrive\\Desktop\\CopiedFile.txt");

        int i;
        while ((i=r.read()) != -1)
        {
            w.write((char)i);
        }
        System.out.println("Data copied successfully..!");
    }
}
