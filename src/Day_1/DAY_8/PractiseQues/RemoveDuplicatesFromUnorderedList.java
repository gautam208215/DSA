package Day_1.DAY_8.PractiseQues;

import Day_8.All.Node;

public class RemoveDuplicatesFromUnorderedList {

    public void removeDuplicates(Node head) {
        Node curr = head;
        if (curr == null || curr.getNext() == null) {
            return;
        }
        Node curr2;
        Node prev;

        while (curr != null) {
            curr2 = curr.getNext();
            prev = curr;

            while (curr2 != null) {
                if (curr.getData() == curr2.getData()) {
                    prev.setNext(curr2.getNext());
                }

                prev = curr2;
                curr2 = curr2.getNext();
            }
        }

        curr = curr.getNext();
    }
}
