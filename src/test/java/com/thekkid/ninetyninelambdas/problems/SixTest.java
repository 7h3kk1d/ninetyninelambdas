package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Six.six;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SixTest {
    @Test
    void examples() {
        assertTrue(six(emptyList()));
        assertTrue(six(asList("x", "a", "m", "a", "x")));
        assertFalse(six(asList("x", "a", "m", "a", "y")));
    }
}