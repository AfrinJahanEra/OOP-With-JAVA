package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream r = new FileInputStream("C:\\Users\\afrin\\OneDrive\\Desktop\\RandomFile.txt");
             FileOutputStream w = new FileOutputStream("C:\\Users\\afrin\\OneDrive\\Desktop\\PrintFile.txt")) {

            int i;
            while ((i = r.read()) != -1) {
                w.write(i);
            }
            System.out.println("Data Copied Successfully...!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
//FileInputStream for read 
//FileOutputStream creat file and write (doesnt need to exist a file) 
