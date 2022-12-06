package ru.job4j.loop;

public class Mortgage {
        public static int year(int amount, int salary, double percent) {
            int year = 0;
            double truPercent = percent / 100;
            double debt = amount * truPercent + amount;

            while (debt > 0) {
                debt = debt - salary;
                year++;
           }
            return year;
        }
}
