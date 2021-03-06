package com.personal.datastructure.singlelinkedlist;

/**
 * Insertion option: 1) At the front of the linked list 2) After a given node.
 * 3) At the end of the linked list.
 */
class SingleLinkedList {
    private Node head;

    Node head() {
        return this.head;
    }

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

    void append(int value) {
        if (this.head == null) {
            this.pushFront(value);
            return;
        }
        this.appendNextNode(this.head, value);
    }

    private void appendNextNode(Node nextNode, int value) {
        Node newNode = new Node(value);
        if (nextNode.next() == null) {
            nextNode.insertNext(newNode);
            return;
        }
        this.appendNextNode(nextNode.next(), value);
    }

    void delete(int value) {
        Node deletedCandidate = new Node(value);
        if (this.head().equals(deletedCandidate)) {
            if (this.head.next() != null) {
                this. head = this.head.next();
                return;
            }
            this.head = null;
            return;
        }
        this.delete(deletedCandidate, this.head);
    }

    private void delete(Node deletedCandidate, Node currentNode) {
        if (currentNode.next().equals(deletedCandidate)) {
            currentNode.insertNext(currentNode.next().next());
            return;
        }
        this.delete(deletedCandidate, currentNode.next());
    }
}
