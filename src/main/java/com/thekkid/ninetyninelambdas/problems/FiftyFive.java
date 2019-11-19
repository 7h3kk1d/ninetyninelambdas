package com.thekkid.ninetyninelambdas.problems;

import com.jnape.palatable.lambda.adt.Maybe;

/**
 * Construct completely balanced binary trees
 * In a completely balanced binary tree, the following property holds for every node:
 * The number of nodes in its left subtree and the number of nodes in its right subtree are almost equal,
 * which means their difference is not greater than one.
 * <p>
 * Write a function to construct completely balanced binary trees for a given number of nodes.
 * The predicate should generate all solutions via backtracking.
 * Put the value t as information into all nodes of the tree.
 */
public class FiftyFive {
    /**
     * @param t Value for each node of the tree
     * @param n Number of nodes
     */
    public static <T> BinaryTree<T> fiftyFive(T t, int n) {
        throw new UnsupportedOperationException();
    }

    public final static class BinaryTree<T> {
        private final T node;
        private final Maybe<BinaryTree<T>> left;
        private final Maybe<BinaryTree<T>> right;

        private BinaryTree(T node,
                           Maybe<BinaryTree<T>> left,
                           Maybe<BinaryTree<T>> right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }

        public static <T> BinaryTree<T> binaryTree(T node,
                                                   Maybe<BinaryTree<T>> left,
                                                   Maybe<BinaryTree<T>> right) {
            return new BinaryTree<T>(node, left, right);
        }

        public T getNode() {
            return node;
        }

        public Maybe<BinaryTree<T>> getLeft() {
            return left;
        }

        public Maybe<BinaryTree<T>> getRight() {
            return right;
        }
    }
}
