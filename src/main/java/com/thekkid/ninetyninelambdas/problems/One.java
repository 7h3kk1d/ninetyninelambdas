package com.thekkid.ninetyninelambdas.problems;


import com.jnape.palatable.lambda.adt.Maybe;

import java.util.List;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Last.last;

/**
 * Find the last box of a list
 */
public class One {
    public static <A> Maybe<A> one(List<A> asList) {
        return last(asList);
    }
}