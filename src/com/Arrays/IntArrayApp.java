package com.Arrays;

/**
 * App to test properties of Array
 * ARRAY is a low level programming structure.
 * Set , Get is in O(1) with index
 * Search , Delete = O(N)
 */
public class IntArrayApp{
    public static void main(String[] args){

        IntArray integerArray = new IntArray(10000);
        for(int i =0; i < 10000; i ++){
            long start = System.nanoTime();
            integerArray.setValue(i,(int)(Math.random()*10000)); //THIS IS IN 100, 200 nano seconds but delete in 200 milli secs.
            long end = System.nanoTime();
            System.out.println("ArraySettingTime:"+(end-start));
        }
        //integerArray.printArr();


        int count = 100;
        while(count > 0) {
            int randNumber = (int) (Math.random() * 10000);
            long start = System.nanoTime();
            integerArray.deleteKey(randNumber);
            long end = System.nanoTime();
            System.out.println("ArrayDeleteTime:"+(end-start));

           /* if (integerArray.deleteKey(randNumber)) {
                System.out.println(" Delete Number:" + randNumber);
            } else {
                System.out.println("Not found:" + randNumber);
            }*/
            count--;
        }

    }
}