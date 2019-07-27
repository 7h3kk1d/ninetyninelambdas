package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.functions.builtin.fn2.ToCollection;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;
import static com.thekkid.ninetyninelambdas.problems.Eleven.eleven;
import static com.thekkid.ninetyninelambdas.problems.Twelve.twelve;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TwelveTest {
    @Test
    void reversesEleven() {
        List<String> ts = asList("aaaabccaadeeee".split(""));
        Iterable<String> twelve = twelve(eleven(ts));

        assertThat(twelve,
                contains(ToCollection.<Matcher<? super String>, ArrayList<Matcher<? super String>>>toCollection(ArrayList::new, map(CoreMatchers::equalTo, ts))));
    }
}