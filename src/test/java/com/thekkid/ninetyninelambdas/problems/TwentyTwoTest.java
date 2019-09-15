package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.TwentyTwo.twentyTwo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TwentyTwoTest {
    @Test
    void provided() {
        assertThat(twentyTwo(4, 9),
                contains(4, 5, 6, 7, 8, 9));
    }
}