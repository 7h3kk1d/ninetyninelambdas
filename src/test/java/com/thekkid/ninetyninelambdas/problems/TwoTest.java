package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;
import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.thekkid.ninetyninelambdas.problems.Two.two;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoTest {
    @Test
    void exampleProvided() {
        Maybe<String> secondToLast = two(asList("a", "b", "c", "d"));

        assertEquals(just("c"), secondToLast);
    }
}