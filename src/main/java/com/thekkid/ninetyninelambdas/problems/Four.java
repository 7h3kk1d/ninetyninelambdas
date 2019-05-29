package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn1.Size;

/**
 * Find the number of elements of a list
 */
public class Four {
    public static long four(Iterable<?> iterable) {
        return Size.size(iterable);
    }
}
