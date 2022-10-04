package by.OOP3;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    private int index;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index = 4;
    }

    @Override
    public boolean hasNext() {
        return this.index > 0;
    }

    @Override
    public String next() {
        switch (index--) {
            case 4:
                return "First name:" + this.firstName;
            case 3:
                return "Last name:" + this.lastName;
            case 2:
                return String.format("Age: %d", this.age);
            case 1:
                return String.format("Salary: %d", this.salary);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker("123", "456", 33, 111);
        while (worker.hasNext())
            System.out.println(worker.next());
    }
}
