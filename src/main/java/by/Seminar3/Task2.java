package by.Seminar3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Марс", "Юпитер",
                            "Сатурн", "Уран", "Нептун", "Плутон"};

        ArrayList<String> listPlanets = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int len  = input.nextInt();
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            listPlanets.add(planets[rnd.nextInt(planets.length)]);
        }
        System.out.println(listPlanets);
        listPlanets.sort(Comparator.naturalOrder());
        System.out.println(listPlanets);

        int count = 0;
        String currentPlanet = listPlanets.get(0);
        for (String planet: listPlanets ) {
            if (planet.equals(currentPlanet))
                count++;
            else {
                System.out.printf("%s: %d%n", currentPlanet, count);
                currentPlanet = planet;
                count = 1;
            }
        }
        System.out.printf("%s: %d%n", currentPlanet, count);

        int index = 1;
        while(index<listPlanets.size()) {
            if (listPlanets.get(index).equals(listPlanets.get(index-1)))
                listPlanets.remove(index);
            else
                index ++;
        }

        System.out.println(listPlanets);
    }
}
