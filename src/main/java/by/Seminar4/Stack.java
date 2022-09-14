// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().


package by.Seminar4;

public class Stack<T> {
    private T[] array;
    private int len;

    public Stack(int len) {
        this.array = (T[]) new Object[len];
        len = 0;
    }

    public int size()
    {
        return len;
    }

    public boolean empty()
    {
        return size() == 0;
    }

    public void push(T item)
    {
        this.array[len++] = item;
    }

    public T peek()
    {
        return this.array[len-1];
    }

    public T pop()
    {
        return this.array[--len];
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<>(100);
        st.push("aaaa");
        st.push("bbbb");
        st.push("cccc");
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.pop());
    }
}
