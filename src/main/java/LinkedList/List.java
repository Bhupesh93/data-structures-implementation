package LinkedList;

import java.util.Collection;

/**
 * Created by Boobesh S on 8/27/2016.
 */
public interface List<T> {
    int size();
    boolean isEmtpy();
    boolean contains(T data);
    boolean add(T data);
    T remove();

}
