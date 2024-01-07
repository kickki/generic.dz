package list;

import org.w3c.dom.Node;

public interface LinkedList<T>{
    void insertStart(T element);
    void insertEnd(T element);
    int size();
    T get(int index);
}
