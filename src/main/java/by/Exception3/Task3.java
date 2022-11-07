//Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера
// необходимо бросить исключение MyArraySizeException.
//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
// массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
// MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
// и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).


package by.Exception3;

public class Task3 {
    public static void main(String[] args) {

    }

    public static int Sum(String[][] array) {
        if(array.length != 4)
            throw new MyArraySizeException();
        for (String[] subarray : array) {
            if(subarray.length !=4)
                throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i ,j);
                }

            }
        }


        return sum;
    }
}


