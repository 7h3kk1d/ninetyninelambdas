package com.thekkid.ninetyninelambdas.problems;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Magnetize.magnetize;

/**
 * Pack consecutive duplicates of list elements into sublists
 */
public class Nine {
    public static Iterable<Iterable<String>> nine(Iterable<String> input) {
        return magnetize(input);
    }
}
