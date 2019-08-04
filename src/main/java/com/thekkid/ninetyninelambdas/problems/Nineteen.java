package com.thekkid.ninetyninelambdas.problems;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Reverse.reverse;
import static com.jnape.palatable.lambda.functions.builtin.fn2.GTE.gte;
import static com.jnape.palatable.lambda.functions.builtin.fn4.IfThenElse.ifThenElse;
import static com.jnape.palatable.lambda.monoid.builtin.Concat.concat;
import static com.thekkid.ninetyninelambdas.problems.Seventeen.seventeen;

/**
 * Rotate a list N places to the left
 */
public class Nineteen {
    public static <T> Iterable<T> nineteen(int n, Iterable<T> ts) {
        // TODO Better implementation for negative case.
        //  See if there's a way to unify implementations efficiently
        return ifThenElse(gte(0),
                k -> seventeen(k, ts).invert().into(concat()),
                k -> reverse(nineteen(n * -1, reverse(ts))),
                n);
    }
}