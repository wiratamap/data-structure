package com.personal.datastructure.singlelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleLinkedListTest {
    @Test
    void pushFront_shouldInsertNewNodeAtFirstElement_whenPushFrontIsInvoked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node expectedNode = new Node(10);

        singleLinkedList.pushFront(10);

        Assertions.assertEquals(expectedNode, singleLinkedList.head());
    }

    @Test
    void pushFront_shouldInsertNewNodeAfterExistingHead_whenPushFrontIsInvoked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node expectedNode = new Node(20);
        singleLinkedList.pushFront(10);

        singleLinkedList.pushFront(20);

        Assertions.assertEquals(expectedNode, singleLinkedList.head());
    }
}
