package com.hpe;

import com.hpe.exception.QueueEmptyException;

/**
 * Created by Boobesh S on 9/4/2016.
 */
public class Queue<T> {

    private Node first;
    private Node last;

    public Queue() {
        first = null;
        last = null;
    }

    public void add(T data) {
        Node node = new Node(data);
        if (first == null) {
            first = node;
            last = first;
        } else {
            last.next = node;
            last = last.next;
        }
    }

    public T remove() throws QueueEmptyException {
        if (first == null) throw new QueueEmptyException("queue is empty");
        T data = (T) first.data;
        first = first.next;
        if (first == null)
            last = null;
        return data;
    }


    private class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }


}
