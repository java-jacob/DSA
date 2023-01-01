package com.SimpleSorting;

public class SelectionSorter {
    /**
     * OUTER LOOP FORWARD TILL N-1
     * INNER LOOP FROM OUT+1 TILL N
     * FIND / MARK THE INDEX OF MIN IN INNER LOOP
     * EXCHANGE THE MIN WITH OUTER LOOP INDEX ELEMENT AFTER INNER LOOP
     *
     * @param arr
     */
    public static void selectionSort(int arr[]){
        for(int out =0 ; out < arr.length -1; out++){
            int min=out;
            for(int in =out+1; in < arr.length; in++){
                if(arr[in]<arr[min]){
                    min = in;                           //min IS THE INDEX POINTING TO MINIMUM INSIDE INNER LOOP and exchanged with
                }
            }
            int temp = arr[out];
            arr[out] = arr[min];
            arr[min] = temp;
        }
    }
}
