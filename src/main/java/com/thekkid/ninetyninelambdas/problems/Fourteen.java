package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn1.Repeat;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;

public class Fourteen {
    public static <T> Iterable<T> fourteen(Iterable<T> ts) {
        return flatten(map(Repeat.<T>repeat().fmap(take(2)), ts));
    }
}
