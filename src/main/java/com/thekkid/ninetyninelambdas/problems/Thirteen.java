package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.choice.Choice2;
import com.jnape.palatable.lambda.adt.hlist.Tuple2;

import static com.jnape.palatable.lambda.adt.hlist.HList.tuple;
import static com.jnape.palatable.lambda.functions.Fn1.fn1;
import static com.jnape.palatable.lambda.functions.builtin.fn1.CatMaybes.catMaybes;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Head.head;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Magnetize.magnetize;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Size.size;
import static com.jnape.palatable.lambda.functions.builtin.fn2.GT.gt;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn4.IfThenElse.ifThenElse;

/**
 * Modified run-length encoding
 */
public class Thirteen {
    public static <T> Iterable<Choice2<T, Tuple2<Long, T>>> thirteen(Iterable<T> ts) {
        return catMaybes(map(tRepeated -> head(tRepeated)
                        .fmap(t -> ifThenElse(gt(1L).contraMap(Tuple2::_1),
                                Choice2::b,
                                fn1(Tuple2<Long, T>::_2).fmap(Choice2::a),
                                tuple(size(tRepeated), t))),
                magnetize(ts)));
    }
}
