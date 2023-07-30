package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(binarySearch(arr, 50));
    }

    public static int binarySearch(int[] arr, int value) {
        if (arr.length == 0) {
            return -1;
        }
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < value) {
                low = mid + 1;
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] == value) {
                return mid;
            }
        }
        return -1;
    }

}