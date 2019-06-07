package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Init.init;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Last.last;

/**
 * Find the last but one box of a list.
 */
public class Two {

    public static <A> Maybe<A> two(Iterable<A> as) {
        return last(init(as));
    }
}
