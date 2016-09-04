package com.hpe.tree;

/**
 * Created by Boobesh S on 9/3/2016.
 */
public class Node<T extends Comparable<T>> implements Comparable<T> {
    private T data;
    private Node left;

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private Node right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}
