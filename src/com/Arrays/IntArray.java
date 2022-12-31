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

}