package com.hpe;

import java.util.Arrays;
import com.hpe.exception.StackEmtpyException;

/**
 * Created by Boobesh S on 9/4/2016.
 */
public class Stack<T> {
    private int size;
    private Object elements[];
    final static int DEFAULT_SIZE = 10;

    public Stack() {
        size = 0;
        elements = new Object[DEFAULT_SIZE];
    }

    public void push(T data){
        if(size == elements.length)
            doubleTheLength();
        elements[size++] = data;
    }

    public T pop() throws StackEmtpyException {
        if(isEmpty()) {
            throw new StackEmtpyException("Stack empty");
        }
        T data = (T) elements[--size];
        elements[size] = null;
        return data;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    private  void doubleTheLength(){
        elements = Arrays.copyOf(elements,elements.length*2);
    }



}
