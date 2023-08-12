package Day_8;

import Day_8.All.Stack;

public class Driver {

    public static void main(String[] args) throws Exception {

//
//        LinkedList linkedList = new LinkedList();
//
//        // reinsertion at some extreme postion greater than linked list length
//        System.out.println("reinsertion at some extreme postion greater than linked list length");
//        linkedList.insertAtPosition(305, -100);
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//
//        linkedList.insertAtPosition(890, -2);
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//
//        linkedList.insertAtPosition(140, 10000);
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//        linkedList.insertAtPosition(34, 2);
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//        // removing from beginning
//        System.out.println("removing from beginning");
//        linkedList.removeFromBeginning();
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//
//        //remove from end
//        System.out.println("removing from end test");
//        linkedList.removeFromEnding();
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();
//
//
//        //remove from some position
//        System.out.println("removing from some position");
//        linkedList.removeFromPosition(-111);
//        System.out.println(linkedList.printSinglyLinkedList());
//        System.out.println(linkedList.getLength() == linkedList.lengthCalc());
//        System.out.println();

//        singlyLinkedList.clearList();
//        System.out.println(singlyLinkedList.lengthCalc());
//        System.out.println(singlyLinkedList.getLength());
//        System.out.println(singlyLinkedList.lengthCalc() == singlyLinkedList.getLength());


        Stack fixedSizeArrayStack = new Stack();
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


    }
}
