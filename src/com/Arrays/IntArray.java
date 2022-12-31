package com.Arrays;

import java.util.Arrays;

/**
 * Basic Array class with Array functionality
 * setValue at Index
 * getValue from Index
 * Search Value
 * Delete value and compact the array.
 * Print array
 *
 */
public class IntArray {
    private int intArr[];

    public IntArray(int size) {
        intArr = new int[size];
    }

    /**
     * O(1)
     */
    public void setValue(int index, int value) {
        intArr[index] = value;
    }

    /**
     * O(1)
     */
    public int getValueAtIndex(int index) {
        return intArr[index];
    }

    /**
     * O(N)
     * Linear Search
     */
    public boolean searchElement(int key) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == key) {
                return true;
            }
        }
        return false;
    }

    /**
     * O(N)
     */
    public boolean deleteKey(int key) {
        int index = -1;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == key) {
                index = i;
            }
        }
        if (index != -1) {
            for (int j = index; j < intArr.length-1; j++) {//Check boundary
                intArr[j] = intArr[j + 1];
            }
            intArr[intArr.length - 1] = 0;
            return true;
        }
        return false;
    }

    public void printArr(){
        Arrays.stream(intArr).forEach(System.out::println);
    }

    public int getSize(){
        return intArr.length;
    }


    public void sort(){ Arrays.sort(intArr);}

    /**
     * BINARY SEARCH FOR ORDERED ARRAY - JACOB JOHN
     *
     * @param key
     * @return
     */
    public boolean binarySearch( int key) {
        int lowerBound = 0;
        int upperBound = this.getSize();
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

    public int[] getInnerArr(){
        return intArr;
    }

}