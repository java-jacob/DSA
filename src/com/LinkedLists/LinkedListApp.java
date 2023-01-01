package com.LinkedLists;

import com.Arrays.IntArray;

public class LinkedListApp {
    public static void main(String[] args) {
     /*   LinkedList linkedList = new LinkedList();
        for(int i =0; i < 10000; i ++){
            long start = System.nanoTime();
            linkedList.insertFirst((int)(Math.random()*10000)); //THIS IS IN 100, 200 nano seconds but delete in 200 milli secs.
            long end = System.nanoTime();
            System.out.println("LinkedListInsertionTime:"+(end-start));
        }
        long start = System.nanoTime();
        linkedList.displayList();
        long end = System.nanoTime();
        System.out.println("LinkedListDisplayTime:"+(end-start));*/

        LinkedList linkedList = new LinkedList();
        for(int i =0; i < 10; i ++){
            linkedList.insertFirst(i); //THIS IS IN 100, 200 nano seconds but delete in 200 milli secs.
        }
        linkedList.displayList();
        linkedList.delete(5);
        linkedList.displayList();;
    }

}
