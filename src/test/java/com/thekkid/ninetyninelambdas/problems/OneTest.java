package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;
import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.thekkid.ninetyninelambdas.problems.One.one;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OneTest {
    @Test
    void providedExample() {
        Maybe<String> last = one(asList("a", "b", "c", "d"));

        assertEquals(just("d"), last);
    }
}