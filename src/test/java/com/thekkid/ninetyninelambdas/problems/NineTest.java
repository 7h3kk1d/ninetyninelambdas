package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Nine.nine;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class NineTest {
    @Test
    void exampleProvided() {
        Iterable<Iterable<String>> actual = nine(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));

        assertThat(actual, contains(contains("a", "a", "a", "a"),
                contains("b"),
                contains("c", "c"),
                contains("a", "a"),
                contains("d"),
                contains("e", "e", "e", "e")));
    }
}