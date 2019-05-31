package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.monoid.builtin.Join.join;
import static com.thekkid.ninetyninelambdas.problems.Eight.eight;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EightTest {

    @Test
    void examples() {
        assertEquals("abcade",
                join().reduceLeft(eight(asList("aaaabccaadeeee".split("")))));
    }
}