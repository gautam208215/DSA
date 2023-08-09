package Day_5.Stack;

public class FixedSizeArrayStack {

    private int capacity;
    private static final int CAPACITY = 10;
    private int[] stackrep;
    private int top = -1;

    public FixedSizeArrayStack() {
        capacity = this.CAPACITY;
        stackrep = new int[capacity];
    }

    public FixedSizeArrayStack(int capacity) {
        this.capacity = capacity;
        stackrep = new int[capacity];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) throws Exception {
        if (size() == capacity) {
            throw new Exception("stack is  full");
        } else {
            stackrep[top + 1] = data;
            top++;
        }
    }

    public int pop() throws Exception {
        int data;
        if (isEmpty()) {
            throw new Exception("stack is empty");
        } else {
            data = stackrep[top];
            stackrep[top--] = Integer.MIN_VALUE;
            return data;
        }
    }

    public String toString() {
        String s = "";
        if (size() > 0) {
            for (int i = 0; i < size() + 1; i++) {
                s = s + stackrep[i] + "     ";
            }
        }
        return s;
    }
}
