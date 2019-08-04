package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Nineteen.nineteen;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class NineteenTest {
    @Test
    void provided() {
        assertThat(nineteen(3, asList("a b c d e f g h".split(" "))),
                contains("d", "e", "f", "g", "h", "a", "b", "c"));
        assertThat(nineteen(-2, asList("a b c d e f g h".split(" "))),
                contains("g", "h", "a", "b", "c", "d", "e", "f"));
    }
}