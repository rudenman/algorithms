package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class TreeTest {

    private final Tree tree =
            new Tree(10,
                    new Tree[]{new Tree(12),
                            new Tree(13),
                            new Tree(14)});

    private final Tree simpleTree =
            new Tree(10, new Tree[]{
                    new Tree(11, new Tree[]{
                            new Tree(4)}),
                    new Tree(5)
            });

    private final Tree hardTree =
            new Tree(3, new Tree[]{
                    new Tree(1, new Tree[]{
                            new Tree(5),
                            new Tree(6, new Tree[]{
                                    new Tree(50),
                                    new Tree(30, new Tree[]{
                                            new Tree(50)
                                    })
                            })
                    }),
                    new Tree(4, new Tree[]{
                            new Tree(18, new Tree[]{
                                    new Tree(30),
                                    new Tree(45)
                            }),
                            new Tree(12, new Tree[]{
                                    new Tree(20)
                            }),
                            new Tree(111, new Tree[]{
                                    new Tree(3),
                                    new Tree(50),
                                    new Tree(40),
                                    new Tree(60)
                            })
                    })
            });


    @Test
    public void testRecursiveSum() {
        assertEquals(49, tree.recursiveSum());
        assertEquals(30, simpleTree.recursiveSum());
        assertEquals(538, hardTree.recursiveSum());
    }

    @Test
    public void testDeepSum() {
        assertEquals(49, tree.deepSum());
        assertEquals(30, simpleTree.deepSum());
        assertEquals(538, hardTree.deepSum());
    }
}