// Написать программу, которая выведет последовательность чисел в заданном диапазоне

package by.OOP3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        new Range(30,0,-3).forEach(list::add);
        System.out.println(list);
    }
}
