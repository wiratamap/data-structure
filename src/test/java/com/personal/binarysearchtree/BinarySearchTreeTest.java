package com.personal.binarysearchtree;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    void print_shouldTraverseInCorrectOrder() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(89);
        binarySearchTree.insert(60);
        binarySearchTree.insert(57);
        binarySearchTree.insert(63);
        binarySearchTree.insert(91);
        binarySearchTree.insert(100);
        binarySearchTree.insert(10);
        binarySearchTree.print();
    }
    
}