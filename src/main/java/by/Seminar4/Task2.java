// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.


package by.Seminar4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit"))
                break;
            if(input.equalsIgnoreCase("print")) {
                System.out.println(String.join(", ", list));
                continue;
            }
            if(input.equalsIgnoreCase("revert")) {
                list.removeFirst();
                continue;
            }
            list.addFirst(input);
        }
    }
}
