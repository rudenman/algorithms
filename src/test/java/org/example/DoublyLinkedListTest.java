package org.example;

import org.junit.jupiter.api.Test;


public class DoublyLinkedListTest<T> {

    private final DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

    @Test
    public void testAdd() {
        list.add(0, 0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(10, 1);
        list.add(20, 3);
        list.add(30, 5);
        list.add(40, list.getSize() - 1);

        System.out.println(list);
    }

    @Test
    public void testRemove() {
        testAdd();

        list.remove(0);
        list.remove(list.getSize() - 1);
        System.out.println(list);
        list.remove(2);
        list.remove(3);
        System.out.println(list);
    }

}
