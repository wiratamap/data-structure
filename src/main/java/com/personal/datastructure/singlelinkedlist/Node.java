package com.personal.datastructure.singlelinkedlist;

class Node {
    private final int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    void insertNext(Node newNode) {
        this.next = newNode;
    }

    Node next() {
        return this.next;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        return value == other.value;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
}
