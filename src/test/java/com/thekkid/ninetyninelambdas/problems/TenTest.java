package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.hlist.HList.tuple;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Repeat.repeat;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;
import static com.thekkid.ninetyninelambdas.problems.Ten.ten;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TenTest {
    @Test
    void empty() {
        assertThat(ten(emptyList()),
                emptyIterable());
    }

    @Test
    void isLazy() {
        assertThat(take(1, ten(flatten(repeat(asList("a", "b"))))),
                contains(tuple(1L, "a")));
    }

    @Test
    void provided() {
        assertThat(ten(asList("aaaabccaadeeee".split(""))),
                contains(tuple(4L, "a"),
                        tuple(1L, "b"),
                        tuple(2L, "c"),
                        tuple(2L, "a"),
                        tuple(1L, "d"),
                        tuple(4L, "e")));
    }
}