package Day_5;

import Day_5.Stack.DynamicArrayStack;
import Day_5.Stack.FixedSizeArrayStack;

public class MainDriver {

    public static void main(String[] args) throws Exception {

        DynamicArrayStack fixedSizeArrayStack = new DynamicArrayStack();
        fixedSizeArrayStack.push(12);
        System.out.println(fixedSizeArrayStack.size());
        fixedSizeArrayStack.push(34);
        System.out.println(fixedSizeArrayStack.size());
        fixedSizeArrayStack.push(56);
        System.out.println(fixedSizeArrayStack.size());
        fixedSizeArrayStack.push(89);
        System.out.println(fixedSizeArrayStack.size());
        System.out.println(fixedSizeArrayStack);
        System.out.println();

        System.out.println("popped 1 " + fixedSizeArrayStack.pop());
        System.out.println(fixedSizeArrayStack);
        System.out.println("popped 2 " + fixedSizeArrayStack.pop());
        System.out.println(fixedSizeArrayStack);
        System.out.println("popped 3 " + fixedSizeArrayStack.pop());
        System.out.println(fixedSizeArrayStack);
        System.out.println("popped 4 " + fixedSizeArrayStack.pop());
        System.out.println(fixedSizeArrayStack);



//        System.out.println("popped 5 " + fixedSizeArrayStack.pop());


    }
}
