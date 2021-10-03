package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;
import com.jnape.palatable.lambda.adt.hlist.Tuple2;
import com.jnape.palatable.lambda.functions.Fn1;
import com.jnape.palatable.lambda.io.IO;

import java.util.Random;

import static com.jnape.palatable.lambda.adt.Maybe.just;
import static com.jnape.palatable.lambda.adt.Maybe.nothing;
import static com.jnape.palatable.lambda.adt.hlist.HList.tuple;
import static com.jnape.palatable.lambda.functions.Fn0.fn0;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Constantly.constantly;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Size.size;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Filter.filter;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Into.into;
import static com.jnape.palatable.lambda.functions.builtin.fn2.LT.lt;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Unfoldr.unfoldr;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Zip.zip;
import static com.jnape.palatable.lambda.functions.builtin.fn4.IfThenElse.ifThenElse;
import static com.jnape.palatable.lambda.io.IO.io;
import static java.lang.Math.abs;

/**
 * Extract a given number of randomly selected elements from a list
 */
public class TwentyThree {
    public static <T> IO<Iterable<T>> twentyThree(long n, Iterable<T> ts) {
        return whetherToKeep(size(ts), n)
                .fmap(zip(ts))
                .fmap(filter(Tuple2::_2))
                .fmap(map(Tuple2::_1));
    }

    private static IO<Iterable<Boolean>> whetherToKeep(long numOfBooleans, long trueBooleans) {
        return io(fn0(Random::new))
                .flatMap(random -> io(() -> unfoldr(into((truesRemaining, sizeRemaining) -> {
                    if (truesRemaining <= 0L) {
                        return nothing();
                    }

                    return io(random::nextLong)
                            .fmap(j -> abs(j) % sizeRemaining)
                            .fmap(i -> {
                                Fn1<Long, Maybe<Tuple2<Boolean, Tuple2<Long, Long>>>> longMaybeFn1 = ifThenElse(lt(truesRemaining),
                                        constantly(just(tuple(true, tuple(truesRemaining - 1, sizeRemaining - 1)))),
                                        constantly(just(tuple(false, tuple(truesRemaining, sizeRemaining - 1)))));
                                return longMaybeFn1.apply(i);
                            })
                            .unsafePerformIO();
                }), tuple(trueBooleans, numOfBooleans))));
    }
}
