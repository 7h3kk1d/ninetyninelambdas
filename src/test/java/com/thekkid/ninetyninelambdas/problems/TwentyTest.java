package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Twenty.twenty;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TwentyTest {
    @Test
    void provided() {
        assertThat(twenty(2, asList("a b c d".split(" "))), contains("a", "c", "d"));
    }
}