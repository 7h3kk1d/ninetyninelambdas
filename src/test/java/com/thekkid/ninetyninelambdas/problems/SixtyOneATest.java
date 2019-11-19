package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.jnape.palatable.lambda.adt.Maybe.nothing;
import static com.thekkid.ninetyninelambdas.problems.FiftyFive.BinaryTree.binaryTree;
import static com.thekkid.ninetyninelambdas.problems.SixtyOneA.sixtyOneA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class SixtyOneATest {
    @Test
    void sortedTree() {
        assertThat(sixtyOneA(binaryTree(1, just(binaryTree(2,
                                                           just(binaryTree(3, nothing(), nothing())),
                                                           just(binaryTree(4,
                                                                           just(binaryTree(
                                                                                   5,
                                                                                   nothing(),
                                                                                   just(binaryTree(
                                                                                           6,
                                                                                           nothing(),
                                                                                           nothing())))),
                                                                           nothing())))),
                                        nothing())), contains(3, 6));
    }
}