package com.thekkid.ninetyninelambdas.problems;

import static com.jnape.palatable.lambda.functions.Fn2.fn2;
import static com.jnape.palatable.lambda.functions.builtin.fn2.GTE.gte;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Iterate.iterate;
import static com.jnape.palatable.lambda.functions.builtin.fn2.TakeWhile.takeWhile;

/**
 * Create a list containing all integers within a given range
 */
public class TwentyTwo {
    public static Iterable<Integer> twentyTwo(int lower, int upper) {
        return takeWhile(gte(upper), iterate(fn2(Integer::sum).apply(1), lower));
    }
}
