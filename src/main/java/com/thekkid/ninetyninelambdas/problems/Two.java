package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Head.head;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Reverse.reverse;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Tail.tail;

public class Two {

    public static <A> Maybe<A> two(Iterable<A> asList) {
        return head(tail(reverse(asList)));
    }
}
