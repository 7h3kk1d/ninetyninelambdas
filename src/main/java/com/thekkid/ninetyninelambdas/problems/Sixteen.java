package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn2.InGroupsOf;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;

public class Sixteen {
    public static <T> Iterable<T> sixteen(int n, Iterable<T> ts) {
        return InGroupsOf.<T>inGroupsOf(n)
                .fmap(map(take(n - 1)))
                .fmap(flatten())
                .apply(ts);
    }
}
