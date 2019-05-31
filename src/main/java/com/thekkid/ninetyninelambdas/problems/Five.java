package com.thekkid.ninetyninelambdas.problems;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Reverse.reverse;

/**
 * Reverse a list
 */
public class Five {
    public static <A> Iterable<A> five(Iterable<A> as) {
        return reverse(as);
    }
}
