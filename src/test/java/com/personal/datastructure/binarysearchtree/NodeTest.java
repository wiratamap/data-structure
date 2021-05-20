package com.personal.datastructure.binarysearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.personal.datastructure.binarysearchtree.Node;

import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void isGreaterThan_shouldReturnTrue_whenOtherNodeHasLesserValue() {
        Node node = new Node(100);
        Node otherNode = new Node(50);

        assertTrue(node.isGreaterThan(otherNode));
    }

    @Test
    void isGreaterThan_shouldReturnFalse_whenOtherNodeHasGreaterValue() {
        Node node = new Node(50);
        Node otherNode = new Node(100);

        assertFalse(node.isGreaterThan(otherNode));
    }

    @Test
    void createLeftChild_shouldReturnCreatedNodeOnLeft() {
        Node node = new Node(50);
        Node newNode = new Node(40);

        node.createLeftChild(newNode);
        Node createdNode = node.leftChild();

        assertEquals(newNode, createdNode);
    }

    @Test
    void createRightChild_shouldReturnCreatedNodeOnRight() {
        Node node = new Node(50);
        Node newNode = new Node(60);

        node.createRightChild(newNode);
        Node createdNode = node.rightChild();

        assertEquals(newNode, createdNode);
    }

    @Test
    void hasLeftChild_shouldReturnTrue_whenNodeHaveLeftChild() {
        Node node = new Node(50);
        Node leftChild = new Node(40);
        node.createLeftChild(leftChild);

        assertTrue(node.hasLeftChild());
    }

    @Test
    void hasLeftChild_shouldReturnFalse_whenNodeDoesNotHaveLeftChild() {
        Node node = new Node(50);

        assertFalse(node.hasLeftChild());
    }

    @Test
    void hasRightChild_shouldReturnTrue_whenNodeHaveRightChild() {
        Node node = new Node(50);
        Node rightChild = new Node(60);
        node.createRightChild(rightChild);

        assertTrue(node.hasRightChild());
    }

    @Test
    void hasRightChild_shouldReturnFalse_whenNodeDoesNotHaveRightChild() {
        Node node = new Node(50);

        assertFalse(node.hasRightChild());
    }
}