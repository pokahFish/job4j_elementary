package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean conditional = left > right;
        int result = conditional ? left : right;
        return result;
    }

    public static void main(String[] args) {

    }
}
