package by.Exception2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(ReadFile(Paths.get("C:\\Users\\shyts\\Documents\\GB\\Java\\JavaSeminar1\\test.txt")));
    }

    public static Map<String, Integer> ReadFile(Path file) {
        List<String> strings;
        try {
            strings = Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            String[] data = string.split("=");
            if(data.length!=2)
                throw new IllegalArgumentException("Illegal string format: " + string);
            int value;
            try {
                value = Integer.valueOf(data[1]);
            } catch (NumberFormatException ex) {
                if(data[1].equals("?"))
                    value = data[0].length();
                else
                    throw new IllegalArgumentException("Illegal string format: " + string);
            }
            map.put(data[0], value);
        }
        return map;
    }
}
