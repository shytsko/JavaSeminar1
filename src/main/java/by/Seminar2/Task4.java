package by.Seminar2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Task4 {
    public static void main(String[] args) {
        WriteTestFile("test.txt", GenerateTestString("test", 100));
    }

    public static String GenerateTestString(String str, int count) {
        return str.repeat(count);
    }

    public static void WriteTestFile(String nameFile, String testString) {
        try (PrintWriter pw = new PrintWriter(nameFile)) {
            pw.println(testString);
            System.out.println("Файл записан");
        }
        catch (IOException ex) {
            System.out.println("Не удалось записать файл");
            System.out.println(ex.getMessage());
        }

    }
}
