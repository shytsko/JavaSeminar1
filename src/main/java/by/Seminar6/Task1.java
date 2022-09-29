// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

package by.Seminar6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(8);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(-1);
        System.out.println(hashSet);

        Set<Integer> linkedSet = new LinkedHashSet();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(2);
        linkedSet.add(4);
        linkedSet.add(5);
        linkedSet.add(6);
        linkedSet.add(3);
        linkedSet.add(8);
        linkedSet.add(-1);
        System.out.println(linkedSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(-1);
        System.out.println(treeSet);
    }
}
