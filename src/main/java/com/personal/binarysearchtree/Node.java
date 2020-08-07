package com.personal.binarysearchtree;

/**
 * Node
 */
class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
    }

    boolean isLessThan(Node otherNode) {
        if (this.value < otherNode.value) {
            return true;
        }
        return false;
    }

    boolean isGreaterThan(Node otherNode) {
        if (this.value > otherNode.value) {
            return true;
        }
        return false;
    }

    boolean hasLeftChild() {
        if (this.left != null) {
            return true;
        }
        return false;
    }

    boolean hasRightChild() {
        if (this.right != null) {
            return true;
        }
        return false;
    }

    void createLeftChild(Node newNode) {
        this.left = newNode;
    }

    Node leftChild() {
        return this.left;
    }

    void createRightChild(Node newNode) {
        this.right = newNode;
    }

    Node rightChild() {
        return this.right;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
}