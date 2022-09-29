// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package by.Seminar5;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class Task3 {

    public static boolean CheckBrackets(String str) {
        Map<Character, Character> bracketsMap = Map.of(']', '[',
                '}', '{',
                ')', '(',
                '>', '<');
        Deque<Character> bracketsStack = new LinkedList<>();
        for (char c: str.toCharArray() ) {
            if(bracketsMap.containsValue(c)) {
                bracketsStack.push(c);
            } else if (bracketsMap.containsKey(c)) {
                if(bracketsStack.isEmpty())
                    return false;
                char openBracket = bracketsStack.pop();
                if(openBracket != bracketsMap.get(c))
                    return false;
            }
        }
        return bracketsStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(CheckBrackets("a+(d*3)"));
        System.out.println(CheckBrackets("[a+(1*3)"));
        System.out.println(CheckBrackets("[6+(3*3)]"));
        System.out.println(CheckBrackets("{a}[+]{(d*3)}"));
        System.out.println(CheckBrackets("<{a}+{(d*3)}>"));
        System.out.println(CheckBrackets("{a+]}{(d*3)}"));
    }
}
