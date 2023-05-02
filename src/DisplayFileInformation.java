import java.io.File;

public class DisplayFileInformation {
    public static void main(String[] args) {
        System.out.println("Java program to display file information");
        File f = new File("C:\\Users\\AMAN\\OneDrive\\Desktop\\FileHandling.txt");
        if(f.exists())
        {
            System.out.println("File Name:"+f.getName());
            System.out.println("FilePath"+f.getAbsolutePath());
            System.out.println("File Writable"+f.canWrite());
            System.out.println("File Readable"+f.canRead());
            System.out.println("File Size"+f.length());
            System.out.println("File Removed"+f.delete());
        }
        else {
            System.out.println("File does not exists");
        }

    }
}
