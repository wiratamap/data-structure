package com.personal.datastructure.singlelinkedlist;

/**
 * Insertion option: 1) At the front of the linked list 2) After a given node.
 * 3) At the end of the linked list.
 */
class SingleLinkedList {
    private Node head;

    void pushFront(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.insertNext(this.head);
        this.head = newNode;
    }

    void pushAfter(Node node, int value) {
        Node newNode = new Node(value);
        newNode.insertNext(node.next());
        node.insertNext(newNode);
    }

    Node head() {
        return this.head;
    }
}