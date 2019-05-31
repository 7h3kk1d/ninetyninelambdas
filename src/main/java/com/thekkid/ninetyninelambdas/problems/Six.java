package com.thekkid.ninetyninelambdas.problems;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Reverse.reverse;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Eq.eq;
import static com.jnape.palatable.lambda.functions.builtin.fn3.ZipWith.zipWith;
import static com.jnape.palatable.lambda.monoid.builtin.And.and;

/**
 * Find out whether a list is a palindrome
 */
public class Six {
    public static <A> boolean six(Iterable<A> palindrome) {
        return and().reduceLeft(zipWith(eq(), palindrome, reverse(palindrome)));
    }
}
