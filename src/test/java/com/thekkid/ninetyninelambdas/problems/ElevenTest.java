package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.choice.Choice2.a;
import static com.jnape.palatable.lambda.adt.choice.Choice2.b;
import static com.jnape.palatable.lambda.adt.hlist.HList.tuple;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Repeat.repeat;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;
import static com.thekkid.ninetyninelambdas.problems.Eleven.eleven;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class ElevenTest {
    @Test
    void empty() {
        assertThat(eleven(emptyList()),
                emptyIterable());
    }

    @Test
    void isLazy() {
        assertThat(take(1, eleven(flatten(repeat(asList("a", "b"))))),
                contains(a("a")));
    }

    @Test
    void provided() {
        assertThat(eleven(asList("aaaabccaadeeee".split(""))),
                contains(b(tuple(4L, "a")),
                        a("b"),
                        b(tuple(2L, "c")),
                        b(tuple(2L, "a")),
                        a("d"),
                        b(tuple(4L, "e"))));
    }
}