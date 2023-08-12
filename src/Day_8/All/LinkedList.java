package Day_8.All;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Node head;
    private int length;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public LinkedList() {
        head = null;
    }

    public void insertAtEnding(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        length++;
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        length++;
    }

    public void insertAtPosition(int data, int pos) {
        Node node = new Node(data);
        int position = pos;
        if (position <= 0) {
            pos = 0;
        }

        if (position > length - 1) {
            pos = length;
        }

        if (pos == 0 || head == null) {
            insertAtBeginning(data);
            return;
        } else if (pos == length && head != null) {
            insertAtEnding(data);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            length++;
        }

    }

    public int lengthCalc() {
        int lengthOfList = 0;
        Node temp = head;
        while (temp != null) {
            lengthOfList++;
            temp = temp.getNext();
        }
        return lengthOfList;
    }

    //DISPLAY LINKED LIST ELEMENTS
    public List<Integer> printSinglyLinkedList() {
        List<Integer> linkedListElements = new ArrayList<>();
        Node temp = this.head;
        while (temp != null) {
            linkedListElements.add(temp.getData());
            temp = temp.getNext();
        }
        //System.out.println(linkedListElements.size());
        return linkedListElements;
    }


    public void removeFromBeginning() throws Exception {
        if (head == null) {
            throw new Exception("empty linked list");
        } else {
            Node temp = head;
            head = temp.getNext();
            length--;
        }
    }

    public void removeFromEnding() throws Exception {
        if (head == null) {
            throw new Exception("empty linked list");
        } else if (head.getNext() == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            length--;
        }
    }

    public void removeFromPosition(int pos) throws Exception {
        if (pos <= 0) {
            pos = 0;
        }

        if (pos > length - 1) {
            pos = length;
        }

        if (pos == 0 || head == null) {
            removeFromBeginning();
        } else if (pos == length) {
            removeFromEnding();
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            length--;
        }
    }

    public int getLength() {
        return length;
    }


}
