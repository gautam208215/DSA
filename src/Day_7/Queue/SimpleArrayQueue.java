package Day_7.Queue;

import javax.swing.plaf.RootPaneUI;
import java.util.Arrays;

public class SimpleArrayQueue {

    //implementation based on circular array

    private int size;
    private int front;
    private int rear;

    private int[] simpleArr;

    private static final int CAPACITY = 16;
    public static int capacity;

    public SimpleArrayQueue() {
        front = 0;
        rear = 0;
        size = 0;
        simpleArr = new int[CAPACITY];
        this.capacity = CAPACITY;
    }


    public SimpleArrayQueue(int cap) {
        front = 0;
        rear = 0;
        size = 0;
        simpleArr = new int[cap];
        this.capacity = cap;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            throw new IllegalStateException("queue is full : overflow ");
        }
        size++;
        simpleArr[rear] = data;
        rear = (rear + 1) % capacity;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("queue is empty : underflow");
        }
        size--;
        int data = simpleArr[(front % capacity)];
        simpleArr[front] = Integer.MIN_VALUE;
        front = (front + 1) % capacity;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += Integer.toString(simpleArr[(front + i) % capacity]);
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }
}

