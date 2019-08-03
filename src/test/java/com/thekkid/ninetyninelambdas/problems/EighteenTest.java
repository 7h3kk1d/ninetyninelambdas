package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Eighteen.eighteen;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class EighteenTest {
    @Test
    void provided() {
        Iterable<String> eighteen = eighteen(3, 7, asList("a b c d e f g h i k".split(" ")));
        assertThat(eighteen, contains("c", "d", "e", "f", "g"));
    }
}