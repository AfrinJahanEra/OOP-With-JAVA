package File;

// import java.io.FileWriter;
// import java.io.IOException;

// public class FileWriterExample {
//     public static void main(String[] args) {
//         try {
//             FileWriter f = new FileWriter("C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt");
//             try {
//                 f.write("Java programming is the best Language..!");
//             } finally {
//                 f.close();//file have to close
//             }
//             System.out.println("Successfully wrote data to file");
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//             e.printStackTrace();
//         }
//     }
// }





// import java.io.BufferedWriter;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.OutputStreamWriter;
// import java.io.PrintWriter;

// public class FileWriterExample {
//     public static void main(String[] args) {
//         String filePath = "C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt";

//         // Using BufferedWriter
//         try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))) {
//             writer.write("Using BufferedWriter: Java programming is the best Language..!");
//             writer.newLine(); // Add a new line
//             writer.write("Adding another line with BufferedWriter.");
//             System.out.println("Data written using BufferedWriter.");
//         } catch (IOException e) {
//             System.err.println("Error writing with BufferedWriter: " + e.getMessage());
//         }

//         // Using PrintWriter
//         try (PrintWriter writer = new PrintWriter(filePath)) {
//             writer.println("Using PrintWriter: Java programming is the best Language..!");
//             writer.println("Adding another line with PrintWriter.");
//             System.out.println("Data written using PrintWriter.");
//         } catch (IOException e) {
//             System.err.println("Error writing with PrintWriter: " + e.getMessage());
//         }

//         // Using FileOutputStream directly
//         try (FileOutputStream fos = new FileOutputStream(filePath)) {
//             String data = "Using FileOutputStream: Java programming is the best Language..!";
//             fos.write(data.getBytes());
//             System.out.println("Data written using FileOutputStream.");
//         } catch (IOException e) {
//             System.err.println("Error writing with FileOutputStream: " + e.getMessage());
//         }
//     }
// }




import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        String filePathBuffered = "C:\\Users\\afrin\\OneDrive\\Desktop\\BufferedFile.txt";
        String filePathPrint = "C:\\Users\\afrin\\OneDrive\\Desktop\\PrintFile.txt";
        String filePathOutputStream = "C:\\Users\\afrin\\OneDrive\\Desktop\\OutputStreamFile.txt";

        // Using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathBuffered))) {
            bufferedWriter.write("Using BufferedWriter: Java programming is the best Language..!");
            bufferedWriter.newLine(); // Add a new line
            bufferedWriter.write("Adding another line with BufferedWriter.");
            System.out.println("Data written using BufferedWriter.");
        } catch (IOException e) {
            System.err.println("Error writing with BufferedWriter: " + e.getMessage());
        }

        // Using PrintWriter
        try (PrintWriter printWriter = new PrintWriter(filePathPrint)) {
            printWriter.println("Using PrintWriter: Java programming is the best Language..!");
            printWriter.println("Adding another line with PrintWriter.");
            System.out.println("Data written using PrintWriter.");
        } catch (IOException e) {
            System.err.println("Error writing with PrintWriter: " + e.getMessage());
        }

        // Using FileOutputStream directly
        try (FileOutputStream fos = new FileOutputStream(filePathOutputStream)) {
            String data = "Using FileOutputStream: Java programming is the best Language..!";
            fos.write(data.getBytes());
            System.out.println("Data written using FileOutputStream.");
        } catch (IOException e) {
            System.err.println("Error writing with FileOutputStream: " + e.getMessage());
        }
    }
}
