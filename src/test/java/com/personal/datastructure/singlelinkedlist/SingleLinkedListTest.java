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

    @Test
    void pushAfter_shouldInsertNewNodeAfterGivenNode_whenPushAfterIsInvoked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.pushFront(30);
        singleLinkedList.pushFront(20);
        singleLinkedList.pushFront(10);
        Node givenNode = singleLinkedList.head().next();
        Node expectedNode = new Node(25);

        singleLinkedList.pushAfter(givenNode, 25);
        Node actualNode = singleLinkedList.head().next().next();

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    void append_shouldInsertNewNodeAfterLastNode_whenAppendIsInvoked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.pushFront(20);
        singleLinkedList.pushFront(10);
        Node expectedNode = new Node(30);

        singleLinkedList.append(30);
        Node actualNode = singleLinkedList.head().next().next();

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    void append_shouldInsertNewNodeAtFirstElement_whenAppendIsInvoked() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node expectedNode = new Node(10);

        singleLinkedList.append(10);

        Assertions.assertEquals(expectedNode, singleLinkedList.head());
    }

    @Test
    void delete_shouldDelete10FromHead_when10IsHead() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.pushFront(10);

        singleLinkedList.delete(10);

        Assertions.assertNull(singleLinkedList.head());
    }

    @Test
    void delete_shouldDelete20FromLinkedList_when20IsExist() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.pushFront(30);
        singleLinkedList.pushFront(20);
        singleLinkedList.pushFront(10);
        Node expectedNode = new Node(30);

        singleLinkedList.delete(20);
        Node actualNode = singleLinkedList.head().next();

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    void delete_shouldDelete10FromHeadAndMoveNextAsAHead_whenDelete10AsAHead() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.pushFront(30);
        singleLinkedList.pushFront(20);
        singleLinkedList.pushFront(10);
        Node expectedNode = new Node(20);

        singleLinkedList.delete(10);

        Assertions.assertEquals(expectedNode, singleLinkedList.head());
    }
}
