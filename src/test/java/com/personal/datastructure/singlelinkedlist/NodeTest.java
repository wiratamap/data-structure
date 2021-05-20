package com.personal.datastructure.singlelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NodeTest {
    @Test
    void insertNext_shouldInsertAtNext_whenInsertNextIsInvoked() {
        Node node = new Node(10);
        Node insertedNode = new Node(20);
        Node expectedInsertedNode = new Node(20);

        node.insertNext(insertedNode);

        Assertions.assertEquals(expectedInsertedNode, node.next());
    }
}
