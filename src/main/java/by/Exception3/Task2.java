//Создайте метод doSomething(), который может быть источником одного из типов checked exception
// (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение,
// которое вызвал метод doSomething().


        package by.Exception3;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @throws IOException
     */
    public static void doSomething() throws IOException {
        throw new IOException("Exception");
    }
}
