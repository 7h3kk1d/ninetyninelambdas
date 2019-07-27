package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.thekkid.ninetyninelambdas.problems.Fourteen.fourteen;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * Duplicate the elements of a list
 */
class FourteenTest {
    @Test
    void provided() {
        assertThat(fourteen(Arrays.asList("a b c c d".split(" "))),
                contains("a a b b c c c c d d".split(" ")));
    }
}