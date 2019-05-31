package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn1.Head;
import com.jnape.palatable.lambda.functions.builtin.fn1.Magnetize;

import static com.jnape.palatable.lambda.functions.builtin.fn1.CatMaybes.catMaybes;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;

public class Eight {
    public static <A> Iterable<A> eight(Iterable<A> as) {
        return Magnetize.<A>magnetize()
                .fmap(map(Head::head))
                .fmap(catMaybes()).apply(as);
    }
}
