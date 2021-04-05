/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class LinkedQueueOfStrings {

    private Node first, last;

    public class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        if (first == null)
            return true;
        return false;
    }

    public void enqueue(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else oldlast.next = last;
    }

    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        return item;
    }

    public static void main(String[] args) {

    }
}
