package com.SimpleSorting;

public class BubbleSorter {

    /**
     * OUTER LOOP BACKWARD till >1
     * INNER LOOP FORWARD TILL OUT
     * EXCHANGE NEARBY ELEMENTS IN INNERLOOP
     *
     *
     * COMPARISON BETWEEN NEXT TO NEXT ELEMENTS IN INNER LOOP
     * N*N/2 comparisons
     * N*N/4 SWAP
     *
     * @param arr
     */
    public static void bubbleSort(int arr[]){
        for(int out = arr.length-1; out > 1 ; out--){   //Outer loop backward  - END till > 1
            for(int inner=0; inner< out; inner++){        //Inner loop forward  - O till OUT
                if(arr[inner]>arr[inner+1]){            //Exchange with next value if out of order
                    int temp = arr[inner+1];
                    arr[inner+1] = arr[inner];
                    arr[inner] = temp;
                }
            }
        }
    }
}
