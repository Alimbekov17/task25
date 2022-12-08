package task25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("P 1111 CZ");
        Car car2 = new Car("P 2223 CZ");
        Car car3 = new Car("B 1234 KG");
        Car car4 = new Car("B 9999 KG");
        Car car5 = new Car("C 4433 CZ");
        Car car6 = new Car("D 9980 KG");
        Car car7 = new Car("P 1010 CZ");

        Map<Car, CarInfo> cars = new HashMap<>();

        cars.put(car1, new CarInfo("Skoda Superb", 2020, 350000, "White"));
        cars.put(car2, new CarInfo("Skoda Octavia II", 2021, 455000, "Red"));
        cars.put(car3, new CarInfo("Toyota Camry", 2019, 400000, "Black"));
        cars.put(car4, new CarInfo("Toyota Land Cruiser", 2020, 1200000, "White"));
        cars.put(car5, new CarInfo("Mercedes S-Class AMG", 2022, 1500000, "Black"));
        cars.put(car6, new CarInfo("Audi Q8", 2018, 1300000, "Silver"));
        cars.put(car7, new CarInfo("Porsche Cayenne", 2016, 900000, "White"));

        System.out.println("""
                List of Available cars:
                1- Skoda Superb
                2- Skoda Octavia II
                3- Toyota Camry
                4- Toyota Land Cruiser
                5- Mercedes S-Class AMG
                6- Audi Q8
                7- Porsche Cayenne
                8- All Cars info
                """);

        while (true) {
            System.out.println("\nChoose a car to see more info: ");
            String enter = scanner.next();
            switch (enter) {
                case "1" -> System.out.println(car1.toString() + cars.get(car1));
                case "2" -> System.out.println(car2.toString() + cars.get(car2));
                case "3" -> System.out.println(car3.toString() + cars.get(car3));
                case "4" -> System.out.println(car4.toString() + cars.get(car4));
                case "5" -> System.out.println(car5.toString() + cars.get(car5));
                case "6" -> System.out.println(car6.toString() + cars.get(car6));
                case "7" -> System.out.println(car7.toString() + cars.get(car7));
                case "8" -> {
                    System.out.println("\n~~~~~~~~~ * All Cars * ~~~~~~~~~~~~~\n");
                    for (Map.Entry<Car, CarInfo> carCarInfoEntry : cars.entrySet()) {
                        System.out.println(carCarInfoEntry);
                    }
                }
                default -> System.out.println("No Such option!");
            }
        }
    }
}
