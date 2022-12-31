package com.Arrays;

import java.util.Arrays;

public class OrderedArray {
    private int intArr[];
    private int size;
    public OrderedArray(int maxSize){ intArr = new int[maxSize];}

    /**
     * INSERTING INTO AN ORDERED ARRAY
     * CHECKING THE VALUE AN PUSHING THE ELEMENTS TO KEEP ORDER
     * @param key
     */
    public void insert(int key){
        if(size == 0){
            intArr[0] = key;
        } else {
            int index = -1;
            for(int i=0; i < size; i++){
                if(key< intArr[i]){
                    index = i;
                    break;
                }
            }
            if(index != -1) {
                for (int i = size; i > index; i--) {
                    intArr[i] = intArr[i-1];
                }
                intArr[index] = key;
            } else {
                intArr[size]= key;
            }
        }
        size++;
    }

    /**
     * Logic from Book
     * @param key
     */
    public void insertV2FromBook(int key){
        int index;
        for(index=0; index < size; index++){
            if(key< intArr[index]){
                break;
            }
        }
        for (int k = size; k > index; k--) {
            intArr[k] = intArr[k-1];
        }
        intArr[index] = key;
        size++;
    }


    public void printArr(){
        Arrays.stream(intArr).forEach(System.out::println);
    }
    /**
     * O(1)
     */
    public int getValueAtIndex(int index) {
        return intArr[index];
    }
    /**
     * BINARY SEARCH FOR ORDERED ARRAY - JACOB JOHN
     *
     * @param key
     * @return
     */
    public boolean binarySearch( int key) {
        int lowerBound = 0;
        int upperBound = this.size;
        int currIndex = lowerBound + (upperBound - lowerBound) / 2;

        while (true) {
            // System.out.println(currIndex);
            if (key == this.getValueAtIndex(currIndex)) {
                //  System.out.println("Found Index:" + currIndex);
                return true;
            } else if (key < this.getValueAtIndex(currIndex)) {// SEARCH LEFT
                upperBound = currIndex - 1; // -1 = same field already checked
            } else if (key > this.getValueAtIndex(currIndex)) { //SEARCH RIGHT
                lowerBound = currIndex + 1;
            }
            currIndex = lowerBound + (upperBound - lowerBound) / 2;
            if (lowerBound > upperBound) {
                return false; //Element not found
            }
        }
    }
}
