package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Four.four;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FourTest {
    @Test
    void empty() {
        long size = four(emptyList());

        assertEquals(0, size);
    }

    @Test
    void nonEmpty() {
        long size = four(asList(1, 2, 3));

        assertEquals(3, size);
    }
}