package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.choice.Choice2;
import com.jnape.palatable.lambda.adt.hlist.Tuple2;
import com.jnape.palatable.lambda.functions.Fn1;

import static com.jnape.palatable.lambda.functions.builtin.fn2.CmpEq.cmpEq;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn4.IfThenElse.ifThenElse;
import static com.thekkid.ninetyninelambdas.problems.Ten.ten;

/**
 * Modified run-length encoding
 */
public class Eleven {
    public static <T> Iterable<Choice2<T, Tuple2<Long, T>>> eleven(Iterable<T> ts) {
        return map(ifThenElse(cmpEq(1L)
                        .contraMap(Tuple2::_1),
                Fn1.<Tuple2<Long, T>, T>fn1(Tuple2::_2).fmap(Choice2::a),
                Choice2::b), ten(ts));
    }
}
