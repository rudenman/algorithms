package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testBinarySearch() {
        assertEquals(-1, Main.binarySearch(new int[0], 4));
        assertEquals(7, Main.binarySearch(new int[]{10, 20, 22, 22, 33, 44, 55, 100}, 100));
        assertEquals(3, Main.binarySearch(new int[]{10, 20, 22, 22, 33, 44, 55, 100}, 22));
        assertEquals(5, Main.binarySearch(new int[]{11, 22, 23, 24, 35, 41, 51, 1023}, 41));
        assertEquals(-1, Main.binarySearch(new int[]{10, 9, 8, 7, 6, 5}, 5));
    }
}