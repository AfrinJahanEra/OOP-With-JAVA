package File;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File successfully created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Optionally print the stack trace for more details
        }
    }
}


