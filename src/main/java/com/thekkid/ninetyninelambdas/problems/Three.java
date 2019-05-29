package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Head.head;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Drop.drop;

/**
 * Find the K'th element of a list
 */
public class Three {

    public static <A> Maybe<A> three(int k, Iterable<A> as) {
        return head(drop(k - 1, as));
    }
}
