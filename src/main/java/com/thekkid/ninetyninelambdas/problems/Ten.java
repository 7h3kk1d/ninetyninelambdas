package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.hlist.Tuple2;

import static com.jnape.palatable.lambda.adt.hlist.HList.tuple;
import static com.jnape.palatable.lambda.functions.builtin.fn1.CatMaybes.catMaybes;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Head.head;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Magnetize.magnetize;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Size.size;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;

/**
 * Run-length encoding of a list
 */
public class Ten {
    public static <T> Iterable<Tuple2<Long, T>> ten(Iterable<T> ts) {
        return catMaybes(map(tRepeated -> head(tRepeated)
                        .fmap(t -> tuple(size(tRepeated), t)),
                magnetize(ts)));
    }

}
