package LinkedList;

import java.util.NoSuchElementException;

/**
 * Created by Boobesh S on 8/27/2016.
 */
public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public LinkedList(T data) {
        this.head = new Node<T>(data);
        size = 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmtpy() {
        return size == 0;
    }

    public boolean contains(T data) {
        Node<T> iterator = this.head;
        System.out.println("The element in the lists are ... ");
        for (; iterator != null; iterator = iterator.getNext()) {
            if(iterator.compareTo(data) == 0)
            {
                System.out.println("element found "+data);
                return true;
            }
        }
        return false;
    }

    public boolean add(T data) {
        if (this.head == null) {
            head = new Node<T>(data);
            this.size = 1;
            return true;
        }
        Node<T> iterator = this.head;
        for (; iterator.getNext() != null; iterator = iterator.getNext()) ;
        iterator.setNext(new Node(data));
        this.size++;
        return true;
    }

    public T remove() {
        if (this.head == null)
            throw new NoSuchElementException();
        if (this.head.getNext() == null) {
            T data = this.head.getData();
            this.head = null;
            this.size = 0;
            return data;
        }
        Node<T> iterator = this.head.getNext();
        Node<T> previous = this.head;
        for (; iterator.getNext() != null; previous = iterator, iterator = iterator.getNext());
        T data = iterator.getData();
        previous.setNext(null);
        this.size--;
        return data;
    }


    public T getMiddle(){
        Node<T> fastPointer = this.head;
        Node<T> slowPointer = fastPointer;

        while(fastPointer!=null){
            if(fastPointer.getNext() !=null) {
                fastPointer = fastPointer.getNext().getNext();
                slowPointer =slowPointer.getNext();
            }else
                fastPointer = null;

        }
        if(slowPointer != null)
            return slowPointer.getData();

        return null;
    }

    public void display() {
        Node<T> iterator = this.head;
        System.out.println("The element in the lists are ... ");
        for (; iterator != null; iterator = iterator.getNext()) {
            System.out.println(iterator.getData());
        }
    }
}
