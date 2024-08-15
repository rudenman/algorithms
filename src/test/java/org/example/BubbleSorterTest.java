package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSorterTest {
    @Test
    public void testBubbleSort() {
        int[] arr1 = {2, 3, 4, -1};
        BubbleSorter.bubbleSort(arr1);
        assertArrayEquals(new int[]{-1, 2, 3, 4}, arr1);

        int[] arr2 = {-23, 223, 0, 1, 2, 4, 6, -100, 22, 0, 3, 4, 5, 6, 8, 9};
        BubbleSorter.bubbleSort(arr2);
        assertArrayEquals(new int[]{-100, -23, 0, 0, 1, 2, 3, 4, 4, 5, 6, 6, 8, 9, 22, 223}, arr2);

        int[] arr3 = new int[0];
        BubbleSorter.bubbleSort(arr3);
        assertArrayEquals(new int[0], arr3);

        int[] arr4 = new int[1000];
        Random r = new Random();
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = r.nextInt();
        }
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);

        Arrays.sort(arr4);
        BubbleSorter.bubbleSort(arr5);
        assertArrayEquals(arr4, arr5);
    }
}