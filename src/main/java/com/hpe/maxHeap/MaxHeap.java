package com.hpe.maxHeap;

import java.util.Arrays;

/**
 * Created by Boobesh S on 9/6/2016.
 */
public class MaxHeap {
    private static final int FRONT = 0;
    private int maxSize;
    private int size;
    private int array[];

    public MaxHeap() {
        maxSize = 2;
        size = 0;
        array = new int[maxSize];
    }

    private int getParent(int child) {
        if (child == 0)
            return 0;
        return (child - 1) / 2;
    }

    private int getLeftChild(int parent) {
        if (((parent * 2) + 1) < size) return parent * 2 + 1;
        return parent;
    }

    private int getRightChild(int parent) {
        if (((parent * 2) + 2) < size) return parent * 2 + 2;
        return parent;
    }

    public int remove() {
        int max = array[FRONT];
        array[FRONT] = array[size - 1];
        maxHeapify(FRONT);
        size--;
        return max;
    }

    public void display() {
        System.out.println("The elements in the heap are ...");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private boolean isLeaf(int node) {
        return node * 2 >= size;
    }

    private void maxHeapify(int current) {
        if (isLeaf(current))
            return;
        if (array[current] < array[getLeftChild(current)] || array[current] < array[getRightChild(current)]) {
            if (array[getLeftChild(current)] > array[getRightChild(current)]) {
                swap(current, getLeftChild(current));
                maxHeapify(getLeftChild(current));
            } else {
                swap(current, getRightChild(current));
                maxHeapify(getRightChild(current));
            }
        }

    }

    public boolean insert(int newNode) {
        if (size >= maxSize)
            doubleTheLength();
        int newIndex = size;
        array[size++] = newNode;
        while (array[newIndex] > array[getParent(newIndex)]) {
            swap(newIndex, getParent(newIndex));
            newIndex = getParent(newIndex);
            if (newIndex == -1)
                break;
        }
        return true;
    }

    private void swap(int a, int b) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }

    private void doubleTheLength() {
        maxSize = maxSize * 2;
        array = Arrays.copyOf(array, maxSize);
    }

}
