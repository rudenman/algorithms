package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Tree {

    private final int value;

    private List<Tree> relatedNotesList = new ArrayList<>();

    public Tree(int value, Tree[] relatedNotesArray) {
        this.value = value;
        relatedNotesList = Arrays.asList(relatedNotesArray);
    }

    public Tree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Tree> getRelatedNotesList() {
        return relatedNotesList;
    }

    public int recursiveSum() {
        int sum = value;

        for (Tree vertex : relatedNotesList) {
            sum += vertex.recursiveSum();
        }
        return sum;
    }

    public int deepSum() {
        int sum = 0;
        Stack<Tree> stack = new Stack<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            Tree commonVertex = stack.pop();
            sum += commonVertex.getValue();
            for (Tree vertex : commonVertex.getRelatedNotesList()) {
                stack.push(vertex);
            }
        }
        return sum;
    }
}
