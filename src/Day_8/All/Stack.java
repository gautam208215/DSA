package Day_8.All;

public class Stack {

    public int data;
    public int[] stackArr;
    public final int CAPACITY = 16;
    public int capacity;

    public int size;
    public int top = -1;

    public Stack() {
        this.capacity = CAPACITY;
        stackArr = new int[capacity];

    }

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArr = new int[capacity];
    }

    public void push(int data) throws Exception {
        if (size() == capacity) {
            throw new Exception("stack is full");
        } else {
            stackArr[top + 1] = data;
            top++;
        }
    }

    public int pop() throws Exception {
        if (top < 0) {
            throw new Exception("Empty stack");
        } else {
            int data;
            data = stackArr[top];
            stackArr[top] = Integer.MIN_VALUE;
            top--;
            return data;
        }
    }


    public int size() {
        return top + 1;
    }

    public String toString() {
        String s = "";
        if (size() > 0) {
            for (int i = 0; i < size() ; i++) {
                s = s + stackArr[i] + "     ";
            }
        }
        return s;
    }
}
