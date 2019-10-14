package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Unit;
import com.jnape.palatable.lambda.io.IO;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.Test;

import static com.jnape.palatable.lambda.adt.Unit.UNIT;
import static com.jnape.palatable.lambda.functions.builtin.fn1.Repeat.repeat;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Take.take;
import static com.thekkid.ninetyninelambdas.problems.TwentyThree.twentyThree;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableWithSize.iterableWithSize;
import static org.hamcrest.core.IsIterableContaining.hasItem;

class TwentyThreeTest {

    @Test
    void fullSizeGetsWholeList() {
        assertThat(twentyThree(3, asList("a", "b", "c"))
                        .unsafePerformIO(),
                IsIterableContainingInOrder.contains("a", "b", "c"));
    }

    @Test
    void randomIncludesNecessaryElement() {
        assertThat(twentyThree(2, asList("a", "a", "b"))
                        .unsafePerformIO(),
                allOf(hasItem("a"),
                        iterableWithSize(2)));
    }

    @Test
    void stackOverflow() {
        Iterable<Unit> take = take(50_000_000, repeat(UNIT));

        IO<Iterable<Unit>> iterableIO = twentyThree(10_000_000, take);
        iterableIO.unsafePerformIO();
    }
}