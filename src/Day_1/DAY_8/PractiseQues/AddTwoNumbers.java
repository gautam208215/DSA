package Day_1.DAY_8.PractiseQues;

import Day_8.All.Node;

public class AddTwoNumbers {

    public Node addTwoNumbers(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        Node head = new Node(0);
        Node curr = head;

        int advance = 0;
        while (list1 != null && list2 != null) {
            int sum = list1.getData() + list2.getData() + advance;
            advance = sum / 10;
            sum = sum % 10;
            curr.setNext(new Node(sum));
            curr = curr.getNext();
            list1 = list1.getNext();
            list2 = list2.getNext();
        }

        if (list1 != null) {
            if (advance != 0) {
                curr.setNext(addTwoNumbers(list1, new Node(advance)));
            } else {
                curr.setNext(list1);
            }
        } else if (list2 != null) {
            if (advance != 0) {
                curr.setNext(addTwoNumbers(list2, new Node(advance)));
            }
        } else if (advance != 0) {
            curr.setNext(new Node(advance));
        }
        return head.getNext();
    }


}
