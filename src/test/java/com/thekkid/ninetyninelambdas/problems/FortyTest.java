package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.hlist.Tuple2;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static com.jnape.palatable.lambda.functions.Fn2.fn2;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Id.id;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Both.both;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Iterate.iterate;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;
import static com.thekkid.ninetyninelambdas.problems.Forty.forty;
import static java.math.BigInteger.TWO;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FortyTest {
    @Test
    void smallNumbers() {
        map(both(id(), Forty::forty), take(100, iterate(fn2(BigInteger::add).apply(TWO), TWO)))
                .forEach(t2 -> validateGoldbach(t2._1(), t2._2()));
    }

    @Test
    void biggerNumber() {
        validateGoldbach(BigInteger.valueOf(21_000), forty(BigInteger.valueOf(21_000)));
    }

    private void validateGoldbach(BigInteger i, Tuple2<BigInteger, BigInteger> primes) {
        assertThat(primes.into(BigInteger::add), equalTo(i));
        assertTrue(ThirtyOne.thirtyOne(primes._1()));
        assertTrue(ThirtyOne.thirtyOne(primes._2()));
    }
}