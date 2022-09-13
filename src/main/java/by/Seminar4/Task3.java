// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

package by.Seminar4;

import java.util.Deque;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        Object[] arr = {1, "fcdkdkd", "lkckf", 'v', 3.45};

        QueueWork(arr);
        StackWork(arr);
    }

    public static void QueueWork(Object[] arr) {
        Deque<Object> queue = new LinkedList<>();
        for (Object item: arr)
            queue.offer(item);
        System.out.println(queue);
    }

    public static void StackWork(Object[] arr) {
        Deque<Object> stack = new LinkedList<>();
        for (Object item: arr)
            stack.push(item);
        System.out.println(stack);
    }
}
