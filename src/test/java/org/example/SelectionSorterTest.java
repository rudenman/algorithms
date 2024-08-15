package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {
    @Test
    public void testSelectionSort() {
        int[] arr1 = {2, 3, 4, -1};
        SelectionSorter.selectionSort(arr1);
        assertArrayEquals(new int[]{-1, 2, 3, 4}, arr1);

        int[] arr2 = {-23, 223, 0, 1, 2, 4, 6, -100, 22, 0, 3, 4, 5, 6, 8, 9};
        SelectionSorter.selectionSort(arr2);
        assertArrayEquals(new int[]{-100, -23, 0, 0, 1, 2, 3, 4, 4, 5, 6, 6, 8, 9, 22, 223}, arr2);

        int[] arr3 = new int[0];
        SelectionSorter.selectionSort(arr3);
        assertArrayEquals(new int[0], arr3);
    }
}