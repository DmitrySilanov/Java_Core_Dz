package Backup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupUtility {

    public static void backupFiles(String sourceDir) {
        File sourceDirectory = new File(sourceDir);
        File backupDirectory = new File("./backup");


        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            System.out.println("Source directory does not exist or is not a directory.");
            return;
        }


        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }


        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        Path sourcePath = file.toPath();
                        Path backupPath = new File(backupDirectory, file.getName()).toPath();
                        Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("File copied: " + file.getName());
                    } catch (IOException e) {
                        System.out.println("Error copying file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        backupFiles("path/to/your/directory");
    }
}