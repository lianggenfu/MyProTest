package com.pig201907.pudonglibrary.starkAndQueue;

public class Node {

    private int data;

    private Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
