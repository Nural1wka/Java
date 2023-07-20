package com.example.mycalculator;

import java.util.*;

class Flat {
    String name;
    int price;
    int room;

    public Flat(String name, int price, int room) {
        this.name = name;
        this.price = price;
        this.room = room;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + room;
    }
}

class City {
    String name;
    int countOfFlat;
    Flat[] flat;

    public City(String name, int countOfFlat) {
        this.name = name;
        this.countOfFlat = countOfFlat;
        this.flat = new Flat[countOfFlat];
    }

    public void addFlat(int index, String name, int price, int room) {
        flat[index] = new Flat(name, price, room);
    }

    public Flat getCheapestFlatWith3Rooms() {
        Flat cheapestFlat = null;
        for (Flat flat : flat) {
            if (flat.room == 3) {
                if (cheapestFlat == null || flat.price < cheapestFlat.price) {
                    cheapestFlat = flat;
                }
            }
        }
        return cheapestFlat;
    }
}

public class FlatSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCities = scanner.nextInt();
        List<City> cities = new ArrayList<>();

        for (int i = 0; i < numOfCities; i++) {
            String cityName = scanner.next();
            int countOfFlat = scanner.nextInt();
            City city = new City(cityName, countOfFlat);
            for (int j = 0; j < countOfFlat; j++) {
                String flatName = scanner.next();
                int price = scanner.nextInt();
                int room = scanner.nextInt();
                city.addFlat(j, flatName, price, room);
            }
            cities.add(city);
        }

        for (City city : cities) {
            System.out.println(city.name);
            for (Flat flat : city.flat) {
                System.out.println(flat);
            }
        }

        for (City city : cities) {
            Flat cheapestFlatWith3Rooms = city.getCheapestFlatWith3Rooms();
            if (cheapestFlatWith3Rooms != null) {
                System.out.println("****************************");
                System.out.println("Cheapest flat with exactly 3 rooms is " + cheapestFlatWith3Rooms.name);
            }
        }
    }
}
