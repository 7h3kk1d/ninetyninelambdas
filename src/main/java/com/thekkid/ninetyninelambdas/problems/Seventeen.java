package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.hlist.Tuple2;
import com.jnape.palatable.lambda.functions.Fn1;
import com.jnape.palatable.lambda.functions.builtin.fn2.Both;

import static com.jnape.palatable.lambda.functions.builtin.fn2.Drop.drop;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;
import static com.jnape.palatable.lambda.functions.builtin.fn3.LiftA2.liftA2;

/**
 * Split a list into two parts; the length of the first part is given
 */
public class Seventeen {
    public static <T> Tuple2<Iterable<T>, Iterable<T>> seventeen(int n, Iterable<T> ts) {
        return Both.<Integer, Fn1<Iterable<T>, Iterable<T>>, Fn1<Iterable<T>, Iterable<T>>>both(take(), drop(), n)
                .<Fn1<Iterable<T>, Tuple2<Iterable<T>, Iterable<T>>>>into(liftA2(Tuple2::tuple))
                .apply(ts);
    }
}
