package com.thekkid.ninetyninelambdas.problems;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static com.thekkid.ninetyninelambdas.problems.ThirtyOne.thirtyOne;
import static java.math.BigInteger.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThirtyOneTest {

    @Test
    void nonGreaterThanOneNats() {
        assertFalse(thirtyOne(ONE));
        assertFalse(thirtyOne(ZERO));
        assertFalse(thirtyOne(BigInteger.valueOf(-1L)));
        assertFalse(thirtyOne(BigInteger.valueOf(-2L)));
    }

    @Test
    void smallPrimes() {
        assertTrue(thirtyOne(TWO));
        assertTrue(thirtyOne(BigInteger.valueOf(3)));
        assertTrue(thirtyOne(BigInteger.valueOf(5)));
        assertTrue(thirtyOne(BigInteger.valueOf(7)));
        assertTrue(thirtyOne(BigInteger.valueOf(11)));
        assertTrue(thirtyOne(BigInteger.valueOf(13)));
        assertTrue(thirtyOne(BigInteger.valueOf(17)));
        assertTrue(thirtyOne(BigInteger.valueOf(19)));
        assertTrue(thirtyOne(BigInteger.valueOf(23)));
        assertTrue(thirtyOne(BigInteger.valueOf(29)));
        assertTrue(thirtyOne(BigInteger.valueOf(31)));
        assertTrue(thirtyOne(BigInteger.valueOf(37)));
        assertTrue(thirtyOne(BigInteger.valueOf(41)));
        assertTrue(thirtyOne(BigInteger.valueOf(43)));
        assertTrue(thirtyOne(BigInteger.valueOf(47)));
        assertTrue(thirtyOne(BigInteger.valueOf(53)));
        assertTrue(thirtyOne(BigInteger.valueOf(59)));
        assertTrue(thirtyOne(BigInteger.valueOf(61)));
        assertTrue(thirtyOne(BigInteger.valueOf(67)));
        assertTrue(thirtyOne(BigInteger.valueOf(71)));
        assertTrue(thirtyOne(BigInteger.valueOf(73)));
        assertTrue(thirtyOne(BigInteger.valueOf(79)));
        assertTrue(thirtyOne(BigInteger.valueOf(83)));
        assertTrue(thirtyOne(BigInteger.valueOf(89)));
        assertTrue(thirtyOne(BigInteger.valueOf(97)));
    }

    @Test
    void biggerPrimes() {
        assertTrue(thirtyOne(BigInteger.valueOf(1000000007L)));
        assertTrue(thirtyOne(BigInteger.valueOf(10000000019L)));
        assertTrue(thirtyOne(BigInteger.valueOf(100000000003L)));
    }

    @Test
    void composites() {
        assertTrue(thirtyOne(TWO));
        assertTrue(thirtyOne(BigInteger.valueOf(9L)));
        assertTrue(thirtyOne(BigInteger.valueOf(8633L)));
    }
}