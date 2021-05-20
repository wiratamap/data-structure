package com.personal.datastructure.binarysearchtree;

class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
    }

    boolean isGreaterThan(Node otherNode) {
        return this.value > otherNode.value;
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
        return this.left != null;
    }

    boolean hasRightChild() {
        return this.right != null;
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
        return value == other.value;
    }
}