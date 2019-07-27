package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Sixteen.sixteen;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class SixteenTest {
    @Test
    void provided() {
        assertThat(sixteen(3, asList("a b c d e f g h i k".split(" "))),
                contains("a b d e g h k".split(" ")));
    }
}