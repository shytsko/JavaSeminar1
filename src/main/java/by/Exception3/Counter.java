//Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
// Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
// Подумайте какой тип исключения подойдет лучше всего.

package by.Exception3;

public class Counter implements AutoCloseable{
    private int counter;
    private boolean closed = false;

    public void increment() {
        if(closed)
            throw new IllegalStateException("Counter already closed");
        counter++;
    }

    public int getCounter() {
        return counter;
    }


    @Override
    public void close() throws Exception {
        if(closed)
            throw new IllegalStateException("Counter already closed");
        closed = true;
    }

    public static void main(String[] args) {

        try (Counter count = new Counter()) {
            count.increment();
            count.increment();
            System.out.println(count.getCounter());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
