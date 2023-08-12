package Day_1.DAY_8.PractiseQues;


import java.util.Stack;

public class StackReversal {

    public static void reverseStack(Stack stack) {
        if (stack.isEmpty())
            return;

        int temp = (int) stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);

    }

    private static void insertAtBottom(Stack stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = (int) stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }
}
