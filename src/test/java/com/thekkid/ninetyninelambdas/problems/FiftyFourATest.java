package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.FiftyFourA.Tree.tree;
import static com.thekkid.ninetyninelambdas.problems.FiftyFourA.fiftyFourA;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FiftyFourATest {
    @Test
    void singleNodeTree() {
        assertTrue(fiftyFourA(tree(1, emptyList())));
    }

    @Test
    void simpleBinaryTree() {
        assertTrue(fiftyFourA(tree(1, singletonList(tree(2, emptyList())))));
        assertTrue(fiftyFourA(tree(1, asList(tree(2, emptyList()), tree(2, emptyList())))));
    }

    @Test
    void nonBinaryTree() {
        assertFalse(fiftyFourA(tree(1, asList(tree(2, emptyList()), tree(2, emptyList()), tree(2, emptyList())))));
        assertFalse(fiftyFourA(tree(1, singletonList(tree(2, asList(tree(3, emptyList()),
                                                                    tree(3, emptyList()),
                                                                    tree(3, emptyList())))))));
    }

}