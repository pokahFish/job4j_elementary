package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second) + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second) + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second) + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.minus(first, second) + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
    }
}
