package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;
import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.thekkid.ninetyninelambdas.problems.Three.three;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeTest {
    @Test
    void exampleProvided() {
        Maybe<String> third = three(3, asList("a", "b", "c", "d", "e"));

        assertEquals(just("c"), third);
    }
}