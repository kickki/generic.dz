import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        MyList<Integer> list = new MyArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(1);
//        System.out.println(list);
//        list.delete(1);
//        System.out.println(list);
        MyLinkedList<Integer> list = new MyLinkedList<>();
           list.insertStart(3);
           list.insertEnd(5);
        System.out.println(list.get(0));
        list.insertStart(2);
        System.out.println(list.get(0));

    }
    }