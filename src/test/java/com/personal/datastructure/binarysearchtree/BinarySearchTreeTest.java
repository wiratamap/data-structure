package com.personal.datastructure.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void insert_shouldPlacedInRoot_whenTreeIsNotCreatedYet() {
        Node expectedRoot = new Node(100);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        Node createdNode = binarySearchTree.tree();

        Assertions.assertEquals(expectedRoot, createdNode);
    }

    @Test
    void insert_shouldPlacedInLeftChild_whenValueIsLessThanSubRoot() {
        Node expectedRoot = new Node(80);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(90);
        binarySearchTree.insert(80);
        Node createdNode = binarySearchTree.tree().leftChild().leftChild();

        Assertions.assertEquals(expectedRoot, createdNode);
    }

    @Test
    void insert_shouldPlacedInRightChild_whenValueIsGreaterThanSubRoot() {
        Node expectedRoot = new Node(120);
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(110);
        binarySearchTree.insert(120);
        Node createdNode = binarySearchTree.tree().rightChild().rightChild();

        Assertions.assertEquals(expectedRoot, createdNode);
    }

    @Test
    void find_shouldReturnNull_whenTreeIsNotYetCreated() {
        Node expectedNode = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Node result = binarySearchTree.find(10);

        Assertions.assertEquals(expectedNode, result);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnRoot() {
        Node expectedSearchedResult = new Node(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);

        Node actualSearchedResult = binarySearchTree.find(10);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnLeftChild() {
        Node expectedSearchedResult = new Node(8);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(8);

        Node actualSearchedResult = binarySearchTree.find(8);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenValueIsFoundOnRightChild() {
        Node expectedSearchedResult = new Node(11);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);
        binarySearchTree.insert(12);

        Node actualSearchedResult = binarySearchTree.find(11);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnNull_whenThereAreNoLeftChildNodeLeft() {
        Node expectedSearchedResult = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);

        Node actualSearchedResult = binarySearchTree.find(8);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnNull_whenThereAreNoRightChildNodeLeft() {
        Node expectedSearchedResult = null;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(11);

        Node actualSearchedResult = binarySearchTree.find(12);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void find_shouldReturnFoundNode_whenSearchPathIsFoundOnLeftThenRight() {
        Node expectedSearchedResult = new Node(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(15);
        binarySearchTree.insert(9);
        binarySearchTree.insert(10);

        Node actualSearchedResult = binarySearchTree.find(10);

        Assertions.assertEquals(expectedSearchedResult, actualSearchedResult);
    }

    @Test
    void delete_shouldSetRootToNull_whenDeletedCandidateIsRootItself() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);

        binarySearchTree.delete(50);
        Node notExistingNode = binarySearchTree.find(50);

        Assertions.assertNull(notExistingNode);
    }

    @Test
    void delete_shouldSetNodeToBeDeletedToNull_whenDeletedCandidateIsLeaf() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(90);
        binarySearchTree.insert(110);

        binarySearchTree.delete(110);
        Node notExistingNode = binarySearchTree.find(110);

        Assertions.assertNull(notExistingNode);
    }

    @Test
    void delete_shouldSetNodeToBeDeletedToNullAndSetRootToNewNode_whenDeletedCandidateHasTwoChildrenAndDeletedCandidateIsRoot() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        Node successorNode = new Node(60);

        binarySearchTree.delete(50);
        Node notExistingNode = binarySearchTree.find(50);
        Node updatedRoot = binarySearchTree.tree();

        Assertions.assertNull(notExistingNode);
        Assertions.assertEquals(successorNode, updatedRoot);
    }

    @Test
    void insert_shouldInvertRightToLeft_whenInvoked() {
        Node expectedLeftChild = new Node(110);
        Node expectedRightChild = new Node(90);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(100);
        binarySearchTree.insert(90);
        binarySearchTree.insert(110);

        binarySearchTree.invert();
        Node actualLeftChild = binarySearchTree.tree().leftChild();
        Node actualRightChild = binarySearchTree.tree().rightChild();

        Assertions.assertEquals(expectedLeftChild, actualLeftChild);
        Assertions.assertEquals(expectedRightChild, actualRightChild);
    }
}