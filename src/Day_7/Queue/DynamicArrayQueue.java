package Day_7.Queue;

public class DynamicArrayQueue {

    private int rear;
    private int front;

    private int size;
    public static final int CAPACITY = 16;
    public static int capacity;
    public static int minCapcity = 1 << 15;

    private int[] circularArr;

    public DynamicArrayQueue() {
        rear = 0;
        front = 0;
        size = 0;
        capacity = CAPACITY;
        circularArr = new int[capacity];
    }

    public DynamicArrayQueue(int cap) {
        rear = 0;
        front = 0;
        size = 0;
        capacity = cap;
        circularArr = new int[capacity];
    }

    public void enqueue(int data) {
        if (size == capacity) {
            expand();
        }
        size++;
        circularArr[rear] = data;
        rear = (rear + 1) % capacity;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is Empty : Underflow");
        } else {
            size--;
            int data = circularArr[(front % capacity)];
            circularArr[front] = Integer.MIN_VALUE;
            front = (front + 1) % capacity;
            return data;
        }
    }

    public void expand() {
        int length = size();
        int[] temp = new int[length << 1];
        for (int i = front; i < rear; i++) {
            temp[i - front] = circularArr[i % capacity];
            circularArr = temp;
            front = 0;
            rear = size - 1;
            capacity = capacity * 2;
        }
    }

    public void shrink() {
        int length = size;
        if (length <= minCapcity || length << 2 >= length) {
            return;
        }
        if (length < minCapcity)
            length = minCapcity;

        int[] temp = new int[length];
        System.arraycopy(circularArr, 0, temp, 0, length + 1);
        circularArr = temp;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += Integer.toString(circularArr[(front + i) % capacity]);
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }

}
