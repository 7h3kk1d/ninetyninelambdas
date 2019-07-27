package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Fifteen.fifteen;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class FifteenTest {
    @Test
    void provided() {
        assertThat(fifteen(3, asList("a b c".split(" "))),
                contains("a a a b b b c c c".split(" ")));
    }
}