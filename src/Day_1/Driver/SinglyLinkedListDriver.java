package Day_1.Driver;

import Day_1.SinglyLinkedList.SinglyLinkedList;

public class SinglyLinkedListDriver {

    public static void main(String[] args) throws Exception {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // reinsertion at some extreme postion greater than linked list length
        System.out.println("reinsertion at some extreme postion greater than linked list length");
        singlyLinkedList.insertAtPosition(305, -100);
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();


        singlyLinkedList.insertAtPosition(890, -2);
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();


        singlyLinkedList.insertAtPosition(140, 10000);
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();

        singlyLinkedList.insertAtPosition(34, 2);
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();

        // removing from beginning
        System.out.println("removing from beginning");
        singlyLinkedList.removeFromBeginning();
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();


        //remove from end
        System.out.println("removing from end test");
        singlyLinkedList.removeFromEnd();
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        System.out.println(singlyLinkedList.getLength() == singlyLinkedList.lengthCalc());
        System.out.println();


        singlyLinkedList.clearList();
        System.out.println(singlyLinkedList.lengthCalc());
        System.out.println(singlyLinkedList.getLength());
        System.out.println(singlyLinkedList.lengthCalc() == singlyLinkedList.getLength());





    }
}
