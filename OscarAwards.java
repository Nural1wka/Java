package com.example.mycalculator;

import java.util.*;

class Oscar {
    String name;
    String surname;
    int movies;
    double rating;

    public Oscar(String name, String surname, int movies, double rating) {
        this.name = name;
        this.surname = surname;
        this.movies = movies;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + movies + " " + rating;
    }
}

public class OscarAwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Oscar> nominees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String surname = scanner.next();
            int movies = scanner.nextInt();
            double rating = scanner.nextDouble();
            nominees.add(new Oscar(name, surname, movies, rating));
        }


        nominees.sort((o1, o2) -> {
            if (o1.rating != o2.rating) {
                return Double.compare(o2.rating, o1.rating);
            } else {
                return Integer.compare(o2.movies, o1.movies);
            }
        });


        for (Oscar nominee : nominees) {
            System.out.println(nominee);
        }
    }
}
