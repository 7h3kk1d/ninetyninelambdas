package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Five.five;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class FiveTest {
    @Test
    void examples() {
        assertThat(five(asList(1, 2, 3)), contains(3, 2, 1));
        assertThat(emptyList(), emptyIterable());
    }
}