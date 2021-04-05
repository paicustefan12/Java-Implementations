import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int sz;

    private class Node {
        private Item item;
        private Node next;
        private Node prev;
    }

    public Deque() {
        this.first = null;
        this.last = null;
    }

    public int size() {
        return sz;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
        else {
            Node newNode = new Node();
            newNode.item = item;
            newNode.next = first;
            if (!isEmpty())
                first.prev = newNode;
            first = newNode;
            if (size() == 1) {
                last = first;
            }
            sz = sz + 1;
        }
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("item is null");
        }
        else {
            Node oldlast = last;
            last = new Node();
            last.item = item;
            last.next = null;
            last.prev = oldlast;
            if (isEmpty())
                first = last;
            else oldlast.next = last;
            sz = sz + 1;
        }
    }

    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("deque is empty");
        }
        else {
            Item item = first.item;
            first = first.next;
            sz = sz - 1;
            return item;
        }
    }

    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("deque is empty");
        }
        else {
            Item item = last.item;
            last.prev = last;
            if (isEmpty())
                last = null;
            sz = sz - 1;
            return item;
        }
    }

    public boolean isEmpty() {
        if (first == null)
            return true;
        return false;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException("do not support remove in the iterator class");
        }

        public Item next() {
            if (current.next == null)
                throw new NoSuchElementException("there isn't a next element");
            else {
                Item item = current.item;
                current = current.next;
                return item;
            }
        }
    }

    public static void main(String[] args) {
        Deque<Integer> d = new Deque<>();
        d.addFirst(3);
        d.addFirst(4);
        d.addLast(5);
        //System.out.println(d.size());
        Integer x;
        System.out.println(d.removeFirst());
        System.out.println(d.removeFirst());
        System.out.println(d.removeFirst());
        System.out.println(d.size());
    }
}
