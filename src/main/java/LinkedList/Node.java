package LinkedList;

import java.util.*;

/**
 * Created by Boobesh S on 8/27/2016.
 */
class Node<T extends Comparable<T>> implements  Comparable<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        java.util.LinkedList linkedList;
        this.next = next;
    }

    public int compareTo(T o) {
        return o.compareTo(this.data);
    }
}
