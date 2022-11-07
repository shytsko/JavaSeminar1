package by.Exception3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super(String.format("Не удалось преобразовать значение в ячейке (%d, %d)", i , j));
    }
}
