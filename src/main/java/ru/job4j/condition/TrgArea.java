package ru.job4j.condition;
import java.lang.Math;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double semiPer = (a + b + c) / 2;
        System.out.println(semiPer);
        double rsl = Math.sqrt(semiPer * ((semiPer - a) * (semiPer - b) * (semiPer - c)));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
