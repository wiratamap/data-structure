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

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (value != other.value)
            return false;
        return true;
    }
}