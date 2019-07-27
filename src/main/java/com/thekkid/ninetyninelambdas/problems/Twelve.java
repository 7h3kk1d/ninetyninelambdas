package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.choice.Choice2;
import com.jnape.palatable.lambda.adt.hlist.Tuple2;

import java.util.Collections;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Repeat.repeat;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;

/**
 * Decode a run-length encoded list
 */
public class Twelve {
    public static <T> Iterable<T> twelve(Iterable<Choice2<T, Tuple2<Long, T>>> ts) {
        return flatten(map(c2 -> c2
                .match(Collections::singleton,
                        t2 -> t2.into((size, t) -> take(size.intValue(), repeat(t)))), ts));
    }

}
