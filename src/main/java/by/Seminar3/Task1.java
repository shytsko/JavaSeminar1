// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package by.Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int len  = input.nextInt();
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            list.add(rnd.nextInt(10));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
