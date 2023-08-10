package Day_6.Stack;

import Day_6.common.Node;

import java.util.EmptyStackException;

public class LinkedStack {

    private int length;
    private Node top;

    public LinkedStack() {
        length = 0;
        top = null;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    public int peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return length;
        }
    }
}


