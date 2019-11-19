package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.TwentySix.twentySix;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singleton;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class TwentySixTest {
    @Test
    void chooseOne() {
        assertThat(twentySix(1, singleton("a")), contains(contains("a")));
        assertThat(twentySix(1, asList("a", "b", "c", "d")),
                   contains(contains("a"), contains("b"), contains("c"), contains("d")));
        assertThat(twentySix(1, emptyList()), contains(emptyIterable()));
    }

    @Test
    void choose2() {
        assertThat(twentySix(2, asList("a", "b", "c")),
                   contains(contains("a", "b"), contains("a", "c"), contains("a", "c")));
    }
}