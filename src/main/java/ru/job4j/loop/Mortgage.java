package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double truPercent = percent / 100;
        while (amount > 0) {
            amount += amount * truPercent - salary;
            year++;
        }
        return year;
    }

}


