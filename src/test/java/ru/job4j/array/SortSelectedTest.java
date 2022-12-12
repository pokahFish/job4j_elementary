package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {6, 10, 7, 8, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8, 10, 15};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {2, 7, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 6, 7};
        assertThat(result).containsExactly(expected);
    }
}