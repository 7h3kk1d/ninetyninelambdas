package com.thekkid.ninetyninelambdas.problems;

import java.util.List;
import java.util.Objects;

/**
 * Check whether a given term represents a binary tree
 * Write a predicate istree which returns true if and only if its argument is a list representing a binary tree.
 * <p>
 * Note that this is an odd one considering we're using a statically typed language. We should just enforce at the type
 * level that our tree is binary.
 */
public class FiftyFourA {
    public static <T> boolean fiftyFourA(Tree<T> tree) {
        throw new UnsupportedOperationException();
    }

    public final static class Tree<T> {
        private T node;
        private List<Tree<T>> children;

        private Tree(T node, List<Tree<T>> children) {
            this.node = node;
            this.children = children;
        }

        public static <T> Tree<T> tree(T node, List<Tree<T>> children) {
            return new Tree<T>(node, children);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tree<?> tree = (Tree<?>) o;
            return getNode().equals(tree.getNode()) &&
                    getChildren().equals(tree.getChildren());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNode(), getChildren());
        }

        public T getNode() {
            return node;
        }

        public List<Tree<T>> getChildren() {
            return children;
        }
    }
}
