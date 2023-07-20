package com.example.mycalculator;

import java.util.*;

class Worker {
    String name;
    double salary;
    int time;

    public Worker(String name, double salary, int time) {
        this.name = name;
        this.salary = salary;
        this.time = time;
    }

    public void increaseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - time;
        if (yearsWorked > 5) {
            salary *= 1.2;
        }
    }

    @Override
    public String toString() {
        return name + " " + (int) salary;
    }
}

public class WorkerSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            double salary = scanner.nextDouble();
            int time = scanner.nextInt();
            Worker worker = new Worker(name, salary, time);
            worker.increaseSalary();
            workers.add(worker);
        }


        workers.sort((w1, w2) -> Double.compare(w2.salary, w1.salary));

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
