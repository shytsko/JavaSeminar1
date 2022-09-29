// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package by.Seminar6;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> array = CreateRandomArray(10);
        System.out.println(PercentageUniqueNumbers(array));
    }

    public static List<Integer> CreateRandomArray(int size) {
        List<Integer> array = new ArrayList<>(size);
        Random rnd = new Random();
        for (int i = 0; i < size; i++)
            array.add(rnd.nextInt(25));
        return array;
    }

    public static double PercentageUniqueNumbers(List<Integer> array) {
        Set<Integer> numbers = new HashSet<>(array);
        Map<Integer, Integer> countNumber = new TreeMap<>();
        for (Integer number : array)
            if(countNumber.containsKey(number))
                countNumber.put(number, countNumber.get(number)+1);
            else
                countNumber.put(number, 1);

        for (Map.Entry<Integer, Integer> entry: countNumber.entrySet())
            if(entry.getValue() > 1)
                numbers.remove(entry.getKey());

        return numbers.size()* 100.0 / array.size();
    }
}
