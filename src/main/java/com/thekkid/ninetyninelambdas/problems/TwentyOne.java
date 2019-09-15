package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn2.Take;

import static com.jnape.palatable.lambda.functions.builtin.fn2.Both.both;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Cons.cons;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Drop.drop;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Into.into;
import static com.jnape.palatable.lambda.monoid.builtin.Concat.concat;

/**
 * Insert an element at a given position into a list.
 */
public class TwentyOne {
    public static <T> Iterable<T> twentyOne(int n, T t, Iterable<T> ts) {
        return both(Take.<T>take(n - 1), drop(n - 1))
                .fmap(into((before, after) -> concat(before, cons(t, after))))
                .apply(ts);
    }
}