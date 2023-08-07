package Day_1.LinkedListPractise;

import Day_1.SinglyLinkedList.SinglyLinkedList;
import Day_1.common.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NthNodeFromEnd {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(12);
        singlyLinkedList.insertAtBeginning(56);
        System.out.println(singlyLinkedList.printSinglyLinkedList());
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(89);
        list.add(78);
        singlyLinkedList.insertElements(list);
        System.out.println(singlyLinkedList.printSinglyLinkedList());

        // find nth node from the end from a linked list

        Node theNthElement = findTheNthElement(singlyLinkedList, 1);
        System.out.println(theNthElement);
        System.out.println(theNthElement.getData());


        // find nth node from the end from linked list without using hash table
        //two pointer approach

        Node nthElement = findTheNthElementUsingTwoPointer(singlyLinkedList, 3);
        System.out.println(nthElement.getData());

    }

    private static Node findTheNthElementUsingTwoPointer(SinglyLinkedList singlyLinkedList, int position) {
        Node ptr1 = singlyLinkedList.getHead();
        Node ptr2 = null;
        for (int i = 1; i < position; i++) {
            if (ptr1 != null) {
                ptr1 = ptr1.getNext();
            }
        }

        while (ptr1 != null) {
            if (ptr2 == null)
                ptr2 = singlyLinkedList.getHead();
            else
                ptr2 = ptr2.getNext();
            ptr1 = ptr1.getNext();

        }

        if (ptr2 != null) {
            return ptr2;
        }
        return null;
    }

    private static Node findTheNthElement(SinglyLinkedList singlyLinkedList, int position) {
        int i = 1;
        Map<Integer, Node> map = new HashMap<>();
        Node temp = singlyLinkedList.getHead();

        while (temp != null) {
            map.put(i, temp);
            i++;
            temp = temp.getNext();
        }
//        System.out.println(map.entrySet());
        return map.get(map.size() - position + 1);
    }
}
