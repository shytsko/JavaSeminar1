//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.


package by.Exception1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(CheckLen(new int[10], 5));
        System.out.println(CheckLen(new int[10], 10));
        System.out.println(CheckLen(new int[10], 15));
    }

    /**
     * Возвращает длину массива, если она не меньше заданной длины
     * @param array - массив
     * @param minLen - минимальная длина
     * @return -1, если длина массива array меньше minLen, иначе длину массива
     */
    public static int CheckLen(int[] array, int minLen) {
        if(array.length >= minLen)
            return array.length;
        else
            return -1;
    }
}
