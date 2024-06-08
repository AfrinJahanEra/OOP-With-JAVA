package Lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter your address: ");
        scanner.nextLine(); // Consume newline character
        String address = scanner.nextLine();

        String content = "Name: " + name + "\n";

        // Create the file
        String filePath;
        if (id % 4 == 0) {
            System.out.println("Enter absolute path for the file: ");
            filePath = scanner.nextLine();
        } else {
            filePath = "myfile.txt"; // Relative path
            System.out.println("Creating file at: " + filePath);
        }

        File file = new File(filePath);

        // Write name to the file
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
        System.out.println("Name written to file.");

        // Read the content
        FileReader reader = new FileReader(file);
        StringBuilder fileContent = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            fileContent.append((char) c);
        }
        reader.close();

        System.out.println("Content of the file:");
        System.out.println(fileContent.toString());

        // Append ID and address
        writer = new FileWriter(file, true); // Append mode
        content = "\nID: " + id + "\nAddress: " + address;
        writer.write(content);
        writer.close();
        System.out.println("ID and address appended to the file.");
    }
}

