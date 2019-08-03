package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn2.Take;

import static com.jnape.palatable.lambda.functions.builtin.fn2.Drop.drop;

public class Eighteen {
    public static <T> Iterable<T> eighteen(int begin, int end, Iterable<T> ts) {
        return Take.<T>take(end)
                .fmap(drop(begin - 1))
                .apply(ts);
    }
}
