package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.jnape.palatable.lambda.adt.Maybe.nothing;
import static com.thekkid.ninetyninelambdas.problems.FiftyFive.BinaryTree.binaryTree;
import static com.thekkid.ninetyninelambdas.problems.FiftyFive.fiftyFive;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FiftyFiveTest {
    @Test
    void balancedTree() {
        assertEquals(binaryTree("t",
                                just(binaryTree("t",
                                                just(binaryTree("t", nothing(), nothing())),
                                                nothing())),
                                just(binaryTree("t", nothing(), nothing()))),
                     fiftyFive("t", 4));
    }
}