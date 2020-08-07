package com.personal.binarysearchtree;

class BinarySearchTree {
    private Node root;

    void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        this.insert(root, newNode);
    }

    Node find(int value) {
        Node searchedNode = new Node(value);
        if (root == null) {
            return null;
        }
        return this.find(root, searchedNode);
    }

    Node find(Node subRoot, Node searchedNode) {
        if (subRoot.equals(searchedNode)) {
            return subRoot;
        }
        if (subRoot.isGreaterThan(searchedNode)) {
            if (!subRoot.hasLeftChild()) {
                return null;
            }
            return this.find(subRoot.leftChild(), searchedNode);
        }

        if (!subRoot.hasRightChild()) {
            return null;
        }
        return this.find(subRoot.rightChild(), searchedNode);
    }

    void insert(Node subRoot, Node newNode) {
        if (subRoot.isGreaterThan(newNode)) {
            if (!subRoot.hasLeftChild()) {
                subRoot.createLeftChild(newNode);
                return;
            }
            this.insert(subRoot.leftChild(), newNode);
            return;
        }

        if (!subRoot.hasRightChild()) {
            subRoot.createRightChild(newNode);
            return;
        }
        this.insert(subRoot.rightChild(), newNode);
    }

    // private void preOrderTraversal(Node subRoot) {
    //     if (subRoot != null) {
    //         System.out.println(subRoot);
    //         preOrderTraversal(subRoot.leftChild());
    //         preOrderTraversal(subRoot.rightChild());
    //     }
    // }

    // void print() {
    //     this.preOrderTraversal(root);
    // }

    Node tree() {
        return this.root;
    }
}