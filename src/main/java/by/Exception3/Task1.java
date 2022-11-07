package by.Exception3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) throws IOException {
        rwLine(Paths.get("C:\\Users\\user\\Documents\\GB\\Java\\JavaSeminar1\\FileList.txt"),
                Paths.get("out.txt"));
    }

    static public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
                out.write(in.readLine());
        }
    }
}
