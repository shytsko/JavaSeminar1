// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package by.Seminar5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static boolean isIsomorphick(String str1, String str2) {
        Map<Character, Character> characterMap = new HashMap<>();
        Set<Character> characterSet = new HashSet<>();
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (characterMap.containsKey(ch1)) {
                if (characterMap.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (characterSet.contains(ch2)) {
                    return false;
                }
                characterMap.put(ch1, ch2);
                characterSet.add(ch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphick("foo","bar" ));
        System.out.println(isIsomorphick("paper","title"));
        System.out.println(isIsomorphick("add","egg"));
        System.out.println(isIsomorphick("note","code"));
    }
}
