package Day_5.Stack;

public class DynamicArrayStack {

    private int capacity;
    private static int CAPACITY = 16;
    private static int MinCapacity = 1 << 15;
    private int[] stackrep;
    private int top = -1;

    public DynamicArrayStack() {
        this.capacity = CAPACITY;
        stackrep = new int[capacity];
    }

    public DynamicArrayStack(int cap) {
        this.capacity = cap;
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
            expand();
        }
        stackrep[++top] = data;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[length << 1];
        System.arraycopy(stackrep, 0, newStack, 0, top + 1);
        stackrep = newStack;
        this.capacity = this.capacity << 1;
    }


    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        return stackrep[top];
    }

    public int pop() throws Exception {
        int data;
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        data = stackrep[top];
        stackrep[top--] = Integer.MIN_VALUE;
        shrink();
        return data;
    }

    private void shrink() {
        int length = top + 1;
        if (length <= MinCapacity || top << 2 >= length) {
            return;
        }
        length = length + top << 1;
        if (top < MinCapacity)
            length = MinCapacity;

        int[] newStack = new int[length];
        System.arraycopy(stackrep, 0, newStack, 0, top + 1);
        stackrep = newStack;
        this.capacity = length;
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