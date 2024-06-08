package File;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("C:\\Users\\afrin\\OneDrive\\Desktop\\Note.txt");
        File newFile = new File("C:\\Users\\afrin\\OneDrive\\Desktop\\RandomFile.txt");

        if (oldFile.exists()) {
            boolean renamed = oldFile.renameTo(newFile);
            if (renamed) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("File doesn't exist.");
        }
    }
}
