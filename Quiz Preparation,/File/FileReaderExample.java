// package File;

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class FileReader {
//     public static void main(String[] args) {
//         try {
//             FileInputStream fis = new FileInputStream("C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt");
//             InputStreamReader reader = new InputStreamReader(fis);
//             try {
//                 int i;
//                 while ((i = reader.read()) != -1) {
//                     System.out.print((char) i);
//                 }
//             } finally {
//                 reader.close();
//                 System.out.println("\nFile closed");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }




package File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
