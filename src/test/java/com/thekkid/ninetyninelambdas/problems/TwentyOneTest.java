package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.TwentyOne.twentyOne;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TwentyOneTest {
    @Test
    void provided() {
        assertThat(twentyOne(2, "alfa", asList("a", "b", "c", "d")),
                contains("a", "alfa", "b", "c", "d"));
    }
}