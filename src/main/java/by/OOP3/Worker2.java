package by.OOP3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Worker2 implements Iterable<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;


    public Worker2(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            private int index=4;
            @Override
            public boolean hasNext() {
                return this.index > 0;
            }

            @Override
            public String next() {
                switch (index--) {
                    case 4:
                        return "First name:" + firstName;
                    case 3:
                        return "Last name:" + lastName;
                    case 2:
                        return String.format("Age: %d", age);
                    case 1:
                        return String.format("Salary: %d", salary);
                    default:
                        return null;
                }
            }
        };
        return it;
    }

    public static void main(String[] args) {
        Worker2 worker2 = new Worker2("aaaa", "bbbbb", 20, 8000);

        for (String s : worker2) {
            System.out.println(s);
        }
    }
}
