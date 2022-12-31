package com.Arrays;

public class OrderedArrayApp {
    public static void main(String args[]){
        OrderedArray orderedIntArray = new OrderedArray(10000);
        IntArray normalIntArray = new IntArray(10000);
        for(int i =0; i < 10000; i ++){
            //long start = System.nanoTime();
            int randNumber = (int)(Math.random()*10000);
            //orderedIntArray.insert(randNumber);
            orderedIntArray.insertV2FromBook(randNumber);
            normalIntArray.setValue(i,randNumber);
            //long end = System.nanoTime();
            //System.out.println("ArraySettingTime:"+(end-start));
        }
        //orderedIntArray.printArr();
        normalIntArray.sort();

        for(int i =0; i < 10000; i ++){
            System.out.println(orderedIntArray.getValueAtIndex(i)+":"+normalIntArray.getValueAtIndex(i));
        }
    }

}
