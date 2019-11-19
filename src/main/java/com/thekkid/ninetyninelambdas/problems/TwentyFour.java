package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.io.IO;

import static com.jnape.palatable.lambda.functions.Fn2.fn2;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Iterate.iterate;
import static com.jnape.palatable.lambda.functions.builtin.fn2.LTE.lte;
import static com.jnape.palatable.lambda.functions.builtin.fn2.TakeWhile.takeWhile;
import static com.thekkid.ninetyninelambdas.problems.TwentyThree.twentyThree;

/**
 * Lotto: Draw N different random numbers from the set 1..M.
 */
public class TwentyFour {
    // TODO: Shuffle order of output
    public static IO<Iterable<Long>> twentyFour(long n, long m) {
        return twentyThree(n, takeWhile(lte(m), iterate(fn2(Long::sum).apply(1L), 1L)));
    }
}
