package com.Arrays;

/**
 * Finding a key in an ordered array using
 * Binary search
 *
 * This example shows the clear advantage of Binary Search over Linear Search in an ordered array
 *
 */
public class BinarySearchOrderedArray {
    public static void main(String[] args) {

        IntArray integerArray = new IntArray(100000);
        for (int i = 0; i < 100000; i++) {
            // long start = System.nanoTime();
            integerArray.setValue(i, (int) (Math.random() * 100000)); //THIS IS IN 100, 200 nano seconds but delete in 200 milli secs.
            //long end = System.nanoTime();
            //System.out.println(end-start);
        }

        long start = System.nanoTime();
        integerArray.sort();
        long end = System.nanoTime();
        System.out.println("SortTime:"+(end-start));

        int count = 100;
        while (count > 0) {
            int randNumber = (int) (Math.random() * 100000);

            start = System.nanoTime();
            integerArray.searchElement(randNumber);
            end = System.nanoTime();
            System.out.print("LinearSearch:" + (end-start));

            start = System.nanoTime();
            integerArray.binarySearch(randNumber);
            end = System.nanoTime();
            System.out.print("   BinarySearch:"+(end-start));
            System.out.println();


            /*if (integerArray.binarySearch(randNumber)) {
                System.out.println("Found Number:" + randNumber);
            } else {
                System.out.println("Not found:" + randNumber);
            }*/
            count--;
        }

    }
}
