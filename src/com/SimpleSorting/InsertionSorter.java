package com.SimpleSorting;

public class InsertionSorter {
    /**
     * OUTER LOOP FROM 1 till END
     * MARK 1 or the OUT ELEMENT
     * INNER LOOP MOVE ELEMENTS TILL MARK TILL THE POSITION FOR MARK IS FOUND
     * INSERT MARK IN POSITION
     * @param arr
     */
    public static void insertionSort(int arr[]){
        for(int out=1; out< arr.length; out++){
            int temp = arr[out];                //MARK REMOVED AND KEPT IN TEMP LOCATION
            int in = out;                       //INNER LOOP OUTER END
            while(in >0 && arr[in-1] >= temp){  //TILL temp is SMALLER shift out
                arr[in] =arr[in-1];
                --in;
            }
            arr[in]= temp;
        }
    }
}
