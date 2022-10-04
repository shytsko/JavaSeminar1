package by.OOP3.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Пупкин", 40, 170, 80));
        persons.add(new Person("Сидоров", 35, 175, 83));
        persons.add(new Person("Иванов", 55, 160, 100));
        persons.add(new Person("Гейтс", 60, 165, 60));
        persons.add(new Person("Шурпик", 40, 172, 75));
        persons.add(new Person("Незнайка", 5, 100, 20));

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("---------------------");
//        Collections.sort(persons);

        persons.sort(Person::compareTo);

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
