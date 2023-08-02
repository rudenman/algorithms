package org.example;

public class Main {

    public static void selectionSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minElementIndex = i;
            minElementIndex = searchMinElementArray(arr, minElementIndex, arr.length);
            swap(arr, i, minElementIndex);
        }
    }

    public static int searchMinElementArray(int[] arr, int startIndex, int endIndex) {
        int minElementIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] < arr[minElementIndex]) {
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int copyElement = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = copyElement;
    }

}