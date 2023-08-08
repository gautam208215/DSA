package Day_4.PractiseQuestion;

import Day_1.SinglyLinkedList.SinglyLinkedList;
import Day_1.common.Node;

import java.util.ArrayList;
import java.util.List;

public class Practise {

    public static void main(String[] args) {


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.insertAtBeginning(12);
//        singlyLinkedList.insertAtBeginning(56);
//        System.out.println(singlyLinkedList.printSinglyLinkedList());
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(78);
        list.add(89);
        singlyLinkedList.insertElements(list);
        System.out.println(singlyLinkedList.printSinglyLinkedList());


        ///reverse a singlyLinkedList
        Node node = reverseSinglyLinkedList(singlyLinkedList);
        System.out.println(node);

        //Insertign a node in Sorted a linked list
        Node addedLink = insertNodeInSortedList(singlyLinkedList.getHead(), new Node(67));
        System.out.println(addedLink);

        //printing linked list from end
        printListfromEnd(singlyLinkedList.getHead());

    }

    private static void printListfromEnd(Node head) {
        if (head == null) {
            return;
        }

        printListfromEnd(head.getNext());
        System.out.println(head.getData());
    }

    private static Node insertNodeInSortedList(Node head, Node newNode) {

        Node current = head;
        Node temp = new Node();
        if (head == null) {
            return newNode;
        }

        while (current != null && current.getData() < newNode.getData()) {
            temp = current;
            current = current.getNext();
        }

        newNode.setNext(current);
        temp.setNext(newNode);
        return head;

    }


    private static Node reverseSinglyLinkedList(SinglyLinkedList singlyLinkedList) {
        Node current = singlyLinkedList.getHead();
        Node prev = null;
        while (current != null) {
            Node next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }


}
