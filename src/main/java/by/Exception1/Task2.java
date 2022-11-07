//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
//значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3

package by.Exception1;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {5,647,645,6,8,4856,6,47,12};
        System.out.println(Find(array, 6, 5));
//        System.out.println(Find(array, 10, 5));
//        System.out.println(Find(array, 10, 15));
        System.out.println(Find(null, 10, 15));
    }

    public static int Find(int[] array, int findValue, int minLen) {
        if(array==null)
            throw new RuntimeException("Array is null");
        if(array.length < minLen)
            throw new RuntimeException("Array length is too small");
        for (int i = 0; i < array.length; i++)
            if(array[i]==findValue)
                return i;
        throw new RuntimeException("Value not found");
    }
}
