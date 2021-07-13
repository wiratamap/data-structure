package com.personal.datastructure.binarysearchtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinarySearchTree {
    private Node root;

    Node tree() {
        return this.root;
    }

    private void insert(Node subRoot, Node newNode) {
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

    void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        this.insert(this.root, newNode);
    }

    private Node find(Node subRoot, Node searchedNode) {
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

    Node find(int value) {
        Node searchedNode = new Node(value);
        if (root == null) {
            return null;
        }
        return this.find(root, searchedNode);
    }

    private Node findSmallestFrom(Node root) {
        Node successor = root;
        while (root.hasLeftChild()) {
            successor = root.leftChild();
            root = root.leftChild();
        }
        return successor;
    }

    private Node delete(Node root, Node deletedCandidate) {
        if (root.equals(deletedCandidate)) {
            if (!root.hasLeftChild() && !root.hasRightChild()) {
                return null;
            }
            Node successor = this.findSmallestFrom(root.rightChild());
            root.replaceValueWith(successor);
            Node deletedNode = this.delete(root.rightChild(), root);
            root.createRightChild(deletedNode);
            return root;
        }
        if (deletedCandidate.isGreaterThan(root)) {
            Node deletedNode = this.delete(root.rightChild(), deletedCandidate);
            root.createRightChild(deletedNode);
            return root;
        }
        Node deletedNode = this.delete(root.leftChild(), deletedCandidate);
        root.createLeftChild(deletedNode);
        return root;
    }

    void delete(int value) {
        Node deletedCandidate = new Node(value);
        this.root = this.delete(this.root, deletedCandidate);
    }

    private Node invert(Node root) {
        if (null == root) {
            return null;
        }
        Node leftNode = this.invert(root.leftChild());
        Node rightNode = this.invert(root.rightChild());
        root.createLeftChild(rightNode);
        root.createRightChild(leftNode);
        return root;
    }

    void invert() {
        this.root = this.invert(this.root);
    }

    private List<Node> inOrderTraversal(Node root) {
        if (null == root) {
            return Collections.emptyList();
        }
        List<Node> allNodes = new ArrayList<>();
        allNodes.addAll(this.inOrderTraversal(root.leftChild()));
        allNodes.add(root);
        allNodes.addAll(this.inOrderTraversal(root.rightChild()));
        return allNodes;
    }

    List<Node> inOrderTraversal() {
        return this.inOrderTraversal(this.root);
    }
}