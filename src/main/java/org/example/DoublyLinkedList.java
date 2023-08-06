package org.example;


public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }


    public void add(T t) {
        Node<T> newNode = new Node<>(t);
        if (size == 0) {
            head = newNode;
            newNode.next = tail;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void add(T t, int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == size || index == 0) {
            add(t);
            return;
        }
        int i = 0;
        Node<T> currentNode = head;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        Node<T> newNode = new Node<>(t);
        newNode.prev = currentNode.prev;
        newNode.next = currentNode;
        currentNode.prev.next = newNode;
        currentNode.prev = newNode;
        size++;
    }

    public int remove(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return -1;
        }
        if (index == 0 && size == 1) {
            size = 0;
            return 0;
        }
        if (index == 0) {
            head = head.next;
            head.prev = tail;
            size--;
            return 0;
        }
        if (index == size - 1) {
            tail = tail.prev;
            tail.next = head;
            size--;
            return 0;
        }
        Node<T> currentNode = head.next;
        int i = 1;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        currentNode.next.prev = currentNode.prev;
        currentNode.prev.next = currentNode.next;
        size--;
        return 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node<T> currentNode = head;
        while (i < index) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.value;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < size; i++) {
            data.append(this.get(i)).append(" ");
        }
        return data.toString();
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;
        private Node<T> prev;

        private Node(T value) {
            this.value = value;
        }
    }
}
