package com.thekkid.ninetyninelambdas.problems;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.Test;

import static com.thekkid.ninetyninelambdas.problems.Seven.Node.Leaf.l;
import static com.thekkid.ninetyninelambdas.problems.Seven.Node.TreeLevel.t;
import static com.thekkid.ninetyninelambdas.problems.Seven.seven;
import static org.hamcrest.MatcherAssert.assertThat;

class SevenTest {

    @Test
    void examples() {
        assertThat(seven(t(l("a"), t(l("b"), t(l("c"), l("d")), l("e")))),
                IsIterableContainingInOrder.contains("a", "b", "c", "d", "e"));
    }
}