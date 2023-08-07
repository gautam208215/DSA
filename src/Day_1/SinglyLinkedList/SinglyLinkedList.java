package Day_1.SinglyLinkedList;

import Day_1.common.Node;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {

    private Node head;
    private int length = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    //insert at beginning
    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.setNext(null);
        } else {
            Node temp = head;
            node.setNext(temp);
            head = node;
        }
        length++;
    }

    //INSERTION AT END
    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.setNext(null);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        length++;
    }

    //INSERT AT POSTION
    public void insertAtPosition(int data, int position) {
        Node node = new Node(data);
        if (position <= 1 || head == null) {
            insertAtBeginning(data);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp.getNext() != null; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        length++;
    }

    public void insertAtPositionUsingLength(int data, int position) {
        Node node = new Node(data);

        if (position < 1) {
            position = 1;
        }

        if (position > length) {
            position = length + 1;
        }

        if (head == null) {
            head = node;
        } else if (position == 1) {
            node.setNext(head);
            head = node;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        length++;
    }


    //REMOVE FROM BEGINNING
    public void removeFromBeginning() throws Exception {
        if (head == null) {
            throw new Exception("empty linked list");
        } else {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            length--;

        }
    }

    //REMOVE FORM END
    public void removeFromEnd() throws Exception {
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
        }
        length--;
    }

    //REMOVE FROM SPECIFIC POSITION
    public void removeFromPosition(int position) throws Exception {
        if (position <= 1) {
            position = 1;
        }

        if (position >= length) {
            position = length;
        }

        if (head == null) {
            throw new Exception("empty linked list");
        } else {
            if (position == 1) {
                head = head.getNext();
            } else {
                Node temp = head;
                for (int i = 1; i < position - 1; i++) {
                    temp = temp.getNext();
                }
                temp.setNext(temp.getNext().getNext());

            }
        }

        length--;
    }

    //REMOVE FROM SPECIFIC POSTION METHOD 2, removinf redundant if statements
    public void removeFromPositionFunc(int position) {
        if (position <= 1 && head != null) {
            head = head.getNext();
        } else if (head == null) {
            return;
        } else {
            position = length;
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length--;
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

    //LENGTH FUCNTION CALCULATOR
    public int lengthCalc() {
        int lengthOfList = 0;
        Node temp = head;
        while (temp != null) {
            lengthOfList++;
            temp = temp.getNext();
        }
        return lengthOfList;
    }

    //FIND POSITON OF PASSED VALUE
    public int getPosition(int data) throws Exception {
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            pos++;
            if (temp.getData() == data) {
                return pos;
            }
            temp = temp.getNext();
        }
        throw new Exception("value not found");
    }

    //EMPTY THE ENTIRE LIST
    public void clearList() {
        head = null;
        length = 0;
    }

    //Insert a list of elements
    public void insertElements(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            insertAtEnd(items.get(i));
        }
    }
}
