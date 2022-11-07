package by.Exception3;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Не верный размер массива. Должен быть 4х4");
    }
}
