package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int divideIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, divideIndex - 1);
            quickSort(arr, divideIndex, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int leftIndex = startIndex, rightIndex = endIndex;
        int pivot = arr[new Random().nextInt(endIndex - startIndex) + startIndex];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int leftIndex, int rightIndex) {
        int tmp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tmp;
    }

}