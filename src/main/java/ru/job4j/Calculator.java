package ru.job4j;

public class Calculator {

    public static void plus(int first, int second) {

        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

    }
}

//        int one = 1;
//        int two = 2;
//        int six = 6;
//        int four = 4;
//        int five = 5;
//        int sixDivTwo = six / two;
//        int fiveMinusTwo = five - two;
//        int fourTimeTwo = four * two;
//
//        System.out.println(sixDivTwo);
//        System.out.println(fiveMinusTwo);
//        System.out.println(fourTimeTwo);


