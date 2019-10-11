package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.io.IO;

import java.util.Random;

import static com.jnape.palatable.lambda.functions.Fn0.fn0;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Constantly.constantly;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Size.size;
import static com.jnape.palatable.lambda.functions.builtin.fn2.LTE.lte;
import static com.jnape.palatable.lambda.functions.builtin.fn4.IfThenElse.ifThenElse;
import static com.jnape.palatable.lambda.io.IO.io;
import static com.jnape.palatable.lambda.monad.Monad.join;
import static com.thekkid.ninetyninelambdas.problems.Twenty.twenty;

/**
 * Extract a given number of randomly selected elements from a list
 */
public class TwentyThree {
    public static <T> IO<Iterable<T>> twentyThree(long n, Iterable<T> ts) {
        return io(fn0(Random::new))
                .flatMap(random -> inner(random, n, ts));
    }

    private static <T> IO<Iterable<T>> inner(Random random, long n, Iterable<T> ts) {
        Long size = size(ts);
        return ifThenElse(lte(n),
                constantly(io(ts)),
                s -> join(io(() -> inner(random, n, twenty(random.nextInt() % s, ts)))))
                .apply(size);
    }
}
