package org.example;


public class BinarySearcher {

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