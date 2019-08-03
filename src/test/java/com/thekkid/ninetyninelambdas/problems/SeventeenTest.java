package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.hlist.Tuple2;
import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Seventeen.seventeen;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class SeventeenTest {
    @Test
    void provided() {
        Tuple2<Iterable<String>, Iterable<String>> actual = seventeen(3,
                asList("a b c d e f g h i k".split(" ")));

        assertThat(actual._1(), contains("a b c".split(" ")));
        assertThat(actual._2(), contains("d e f g h i k".split(" ")));
    }
}