package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.coproduct.CoProduct2;
import com.jnape.palatable.lambda.functions.Fn1;
import com.jnape.palatable.lambda.functions.builtin.fn2.Map;

import java.util.Collections;
import java.util.List;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Flatten.flatten;
import static java.util.Arrays.asList;

/**
 * Flatten a nested list structure
 */
public class Seven {
    public static <A> Iterable<A> seven(Node<A> nestedAs) {
        return nestedAs.match(Collections::singletonList,
                Map.<Node<A>, Iterable<A>>map(Seven::seven).fmap(flatten()));
    }


    public abstract static class Node<A> implements CoProduct2<A, Iterable<Node<A>>, Node<A>> {
        public static class Leaf<A> extends Node<A> {
            private final A a;

            private Leaf(A a) {
                this.a = a;
            }

            public static <A> Leaf<A> l(A a) {
                return new Leaf<>(a);
            }

            @Override
            public <R> R match(Fn1<? super A, ? extends R> fn1, Fn1<? super Iterable<Node<A>>, ? extends R> fn2) {
                return fn1.apply(a);
            }
        }

        public static class TreeLevel<A> extends Node<A> {
            private final Iterable<Node<A>> nodes;

            private TreeLevel(List<Node<A>> nodes1) {
                this.nodes = nodes1;
            }

            @SafeVarargs
            public static <A> TreeLevel<A> t(Node<A>... nodes) {
                return new TreeLevel<>(asList(nodes));
            }

            @Override
            public <R> R match(Fn1<? super A, ? extends R> fn1, Fn1<? super Iterable<Node<A>>, ? extends R> fn2) {
                return fn2.apply(nodes);
            }
        }
    }
}
