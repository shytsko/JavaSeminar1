package by.by;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime testDateTime = now;
        LocalDateTime testDateTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 19, 16);
        LocalDateTime morningBegin = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 5, 0);
        LocalDateTime morningEnd = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 11, 59);
        LocalDateTime dayBegin = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 12, 0);
        LocalDateTime dayEnd = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 17, 59);
        LocalDateTime eveningBegin = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 18, 0);
        LocalDateTime eveningEnd = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 22, 59);

        if(testDateTime.isAfter(morningBegin) && testDateTime.isBefore(morningEnd))
            System.out.println(String.format("Доброе утро, %s", name));
        else if (testDateTime.isAfter(dayBegin) && testDateTime.isBefore(dayEnd))
            System.out.println(String.format("Добрый день, %s", name));
        else if (testDateTime.isAfter(eveningBegin) && testDateTime.isBefore(eveningEnd))
            System.out.println(String.format("Добрый вечер, %s", name));
        else
            System.out.println(String.format("Доброй ночи, %s", name));
    }
}