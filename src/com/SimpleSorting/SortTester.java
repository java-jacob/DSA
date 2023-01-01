package com.SimpleSorting;

import com.Arrays.IntArray;

public class SortTester {
    public static void main(String[] args) {
        while(true) {

            IntArray integerBubbleSortArray = new IntArray(10000);
            IntArray integerSelectionSortArray = new IntArray(10000);
            IntArray integerInsertionSortArray = new IntArray(10000);

            for (int i = 0; i < 10000; i++) {
                // long start = System.nanoTime();
                int randomNum = (int) (Math.random() * 10000);
                integerBubbleSortArray.setValue(i, randomNum);
                integerSelectionSortArray.setValue(i, randomNum);
                integerInsertionSortArray.setValue(i, randomNum);
                //long end = System.nanoTime();
                //System.out.println(end-start);
            }
            //integerBubbleSortArray.printArr();

            long start = System.nanoTime();
            BubbleSorter.bubbleSort(integerBubbleSortArray.getInnerArr());
            long end = System.nanoTime();
            System.out.println("BubbleSortTime:     " + (end - start));

            start = System.nanoTime();
            SelectionSorter.selectionSort(integerSelectionSortArray.getInnerArr());
            end = System.nanoTime();
            System.out.println("SelectionSortTime:   "  + (end - start));
            //integerSelectionSortArray.printArr();

            start = System.nanoTime();
            InsertionSorter.insertionSort(integerInsertionSortArray.getInnerArr());
            end = System.nanoTime();
            System.out.println("InsertionSortTime:   " + (end - start));
            //integerInsertionSortArray.printArr();

            //integerBubbleSortArray.printArr();
        }
    }
}
