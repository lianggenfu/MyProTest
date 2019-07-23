package com.pig201907.pudonglibrary.starkAndQueue;

public class Stack {

    public Node stackTop;

    public Node stackBottom;

    public Stack() {
    }

    public Stack(Node stackTop, Node stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }
}
