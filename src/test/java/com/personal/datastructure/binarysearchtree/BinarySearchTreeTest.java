package com.personal.datastructure.binarysearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void insert_shouldPlacedInRoot_whenTreeIsNotCreatedYet() {
        Node expectedRoot = new Node(100);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        Node createdNode = binarySearchTree.tree();

        assertEquals(expectedRoot, createdNode);
    }

    @Test
    void insert_shouldPlacedInLeftChild_whenValueIsLessThanSubRoot() {
        Node expectedRoot = new Node(80);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(90);
        binarySearchTree.insert(80);
        Node createdNode = binarySearchTree.tree().leftChild().leftChild();

        assertEquals(expectedRoot, createdNode);
    }

    @Test
    void insert_shouldPlacedInRightChild_whenValueIsGreaterThanSubRoot() {
        Node expectedRoot = new Node(120);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(110);
        binarySearchTree.insert(120);
        Node createdNode = binarySearchTree.tree().rightChild().rightChild();

        assertEquals(expectedRoot, createdNode);
    }

    @Test
    void find_shouldReturnNull_whenTreeIsNotYetCreated() {
        Node expectedNode = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Node result = binarySearchTree.find(10);

        assertEquals(expectedNode, result);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnRoot() {
        Node expectedSearchedResult = new Node(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);

        Node actualSearchedResult = binarySearchTree.find(10);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnLeftChild() {
        Node expectedSearchedResult = new Node(8);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(8);

        Node actualSearchedResult = binarySearchTree.find(8);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnRightChild() {
        Node expectedSearchedResult = new Node(11);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);
        binarySearchTree.insert(12);

        Node actualSearchedResult = binarySearchTree.find(11);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnNull_whenThereAreNoLeftChildNodeLeft() {
        Node expectedSearchedResult = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);

        Node actualSearchedResult = binarySearchTree.find(8);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnNull_whenThereAreNoRightChildNodeLeft() {
        Node expectedSearchedResult = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);

        Node actualSearchedResult = binarySearchTree.find(12);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenSearchPathIsFoundOnLeftThenRight() {
        Node expectedSearchedResult = new Node(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(15);
        binarySearchTree.insert(9);
        binarySearchTree.insert(10);

        Node actualSearchedResult = binarySearchTree.find(10);

        assertEquals(expectedSearchedResult, actualSearchedResult);
    }
}