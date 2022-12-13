package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {4, 5, 6, 7, 8};
        int source = input.length / 2 - 1;
        int dest = source + 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 6, 5, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {10, 11, 12, 13, 14, 15, 16};
        int source = input.length / 2;
        int dest = source + 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 11, 12, 14, 13, 15, 16};
        assertThat(result).containsExactly(expected);

    }

}