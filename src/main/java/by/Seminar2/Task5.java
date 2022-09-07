package by.Seminar2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task5 {
    public static void main(String[] args) {
        File dir =new File("d:\\");
        WrireFileList(dir, "FileList.txt");
    }

    public static void WrireFileList(File directory, String fileName) {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            if(directory.isDirectory()) {
                File[] files = directory.listFiles();
                for (File file: files) {
                    pw.println(file.getName());
                }
            }
            System.out.println("Файл записан");
        }
        catch (IOException ex) {
            System.out.println("Не удалось записать файл");
            System.out.println(ex.getMessage());        }

    }
}
