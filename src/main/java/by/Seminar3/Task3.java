// Создать список типа ArrayList<Object>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package by.Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add("gfdfghdhfghf");
        list.add("ssde");
        list.add("4");
        list.add(8);
        list.add(5);
        list.add("ekejfm");
        list.add("erygd");

        System.out.println(list);

        int index = 0;
        while (index< list.size())
            if(list.get(index) instanceof Integer)
                list.remove(index);
            else
                index++;
        System.out.println(list);
    }
}
