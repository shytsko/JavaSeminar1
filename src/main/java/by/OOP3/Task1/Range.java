package by.OOP3.Task1;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private int from;
    private int to;
    private int step;

    public Range(int from, int to, int step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    public Range(int from, int to) {
        this(from, to, 1);
    }

    public Range(int to) {
        this(0, to, 1);
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return (step>0) ? (from<to) : (from>to);
            }

            @Override
            public Integer next() {
                int value = from;
                from += step;
                return value;
            }
        };
        return it;
    }
}
