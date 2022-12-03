package ru.job4j.loop;

public class Counter {
    @SuppressWarnings("checkstyle:ParenPad")
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
