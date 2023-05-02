import java.io.File;

public class RenameAFile {
    public static void main(String[] args) {
        System.out.println("Java program to rename a file");
        File f = new File("C:\\Users\\AMAN\\OneDrive\\Desktop\\FileHandling.txt");
        File r = new File("C:\\Users\\AMAN\\OneDrive\\Desktop\\RenamedFile.txt");

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }else {
            System.out.println("File does not exist");
        }

    }
}
