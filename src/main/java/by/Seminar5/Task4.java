// Взять набор строк, например,
// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
package by.Seminar5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task4 {

    public static TreeMap<Integer, List<String>> Sort(String str) {
        TreeMap<Integer, List<String>> lenStringTreeMap = new TreeMap<>();
        String[] words = str.split(" ");
        for (String word: words) {
            int len = word.length();
            if(lenStringTreeMap.containsKey(len))
                lenStringTreeMap.get(len).add(word);
            else {
                ArrayList<String>  temp=new ArrayList<>();
                temp.add(word);
                lenStringTreeMap.put(len, temp);
            }
        }
        return lenStringTreeMap;
    }

    public static void main(String[] args) {
        System.out.println(Sort("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"));
    }
}
