//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен сумме элементов двух
// входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
package by.Exception1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4};
        int[] result = SumArray(arr1, arr2);
        for (int i : result) {
            System.out.print(" " + i);
        }
    }

    public static int[] SumArray(int[] array1, int[] array2) {
        if(array1 == null || array2 == null)
            throw new RuntimeException("Argument is null");
        if(array1.length != array2.length)
            throw new RuntimeException("Length of arrays not equals");

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }
}
