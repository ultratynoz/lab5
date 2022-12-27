import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @org.junit.jupiter.api.Test
    void selectionSort() {
        int[] arr = {5, 3, 2, 4, 1};
        Sorting.selectionSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);

        arr = new int[] {1};
        Sorting.selectionSort(arr);
        expected = new int[] {1};
        assertArrayEquals(expected, arr);

        arr = new int[] {2, 1};
        Sorting.selectionSort(arr);
        expected = new int[] {1, 2};
        assertArrayEquals(expected, arr);

        arr = new int[] {};
        Sorting.selectionSort(arr);
        expected = new int[] {};
        assertArrayEquals(expected, arr);
    }

    @Test
    void insertionSort() {
        int[] arr = {5, 3, 2, 4, 1};
        Sorting.insertionSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);

        arr = new int[] {1};
        Sorting.insertionSort(arr);
        expected = new int[] {1};
        assertArrayEquals(expected, arr);

        arr = new int[] {2, 1};
        Sorting.insertionSort(arr);
        expected = new int[] {1, 2};
        assertArrayEquals(expected, arr);

        arr = new int[] {};
        Sorting.insertionSort(arr);
        expected = new int[] {};
        assertArrayEquals(expected, arr);
    }
}