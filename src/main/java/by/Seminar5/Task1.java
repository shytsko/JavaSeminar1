//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

package by.Seminar5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static  Map<Integer, String> data = Map.of(123456, "Иванов",
                                                        321456, "Васильев",
                                                        234561, "Петрова",
                                                        234432, "Иванов",
                                                        345678, "Иванов");


    public static  Map<String, List<Integer>> data2 = Map.of(   "Иванов", List.of(123456, 234432, 345678),
                                                                "Васильев", List.of(321456),
                                                                "Петрова", List.of(234561));

    public static void DataBySurname(String surName) {
        for (var entry: data.entrySet()) {
            if(entry.getValue().equals(surName)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void DataBySurname2(String surName) {
        System.out.println(data2.get(surName));
    }

    public static void main(String[] args) {
        DataBySurname2("Иванов");
    }
}
