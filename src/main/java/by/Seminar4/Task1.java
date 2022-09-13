// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


package by.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            String[] input = scanner.nextLine().split("~");
            String text = input[0];
            if(text.equalsIgnoreCase("exit")) {
                exit = true;
                continue;
            }
            int num = Integer.parseInt(input[1]);
            if(text.equalsIgnoreCase("print")) {
                if(num<list.size()) {
                    System.out.println(list.get(num));
                    list.remove(num);
                }
                else
                    System.out.println("Не допустимый индекс");
                continue;
            }
            while((list.size()-1)<num)
                list.add("");
            list.set(num, text);

            System.out.println(list);
        }
    }
}
