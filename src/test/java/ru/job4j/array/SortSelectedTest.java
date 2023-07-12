package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortTest3El() {
        int[] data = new int[]{71, 52, 45};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{45, 52, 71};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortTest5El() {
        int[] data = new int[]{5, 14, 4, 17, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 4, 5, 14, 17};
        assertThat(result).containsExactly(expected);
    }
}