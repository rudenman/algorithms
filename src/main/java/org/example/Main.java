package org.example;


public class Main {

    public static int[] mergeSort(int[] arr) {
        int[] tmp;
        int[] currentSrc = arr;
        int[] currentDest = new int[arr.length];

        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(currentSrc, i, i + size, currentDest, i, size);
            }
            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size *= 2;
        }
        return currentSrc;
    }

    private static void merge(int[] src, int src1Start, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start, index2 = src2Start;

        int src1End = Math.min(src1Start + size, src.length);
        int src2End = Math.min(src2Start + size, src.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src[index1] < src[index2])) {
                dest[i] = src[index1];
                index1++;
            } else {
                dest[i] = src[index2];
                index2++;
            }
        }
    }

}