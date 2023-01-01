package com.StackAndQueue;

public class PriorityIntQ {
    private int intArr[];
    private int nItems;
    private int maxSize;

    public PriorityIntQ(int max){
        this.maxSize = max;
        intArr = new int[max];
        nItems = 0;
    }

    /**
     * Check value priority and insert
     * Push all elements to outside.
     *
     * @param value
     */
    public void insert(int value){
        if(nItems ==0 ){
            intArr[nItems++] = value;
        } else {
            int i;
            for(i=nItems-1; i>=0; i--){
                if(value> intArr[i]){
                    intArr[i+1] = intArr[i]; //SHIFT TILL POSITION IS FOUND
                } else {
                    break; //  FOUND POSITION BREAK
                }
            }
            intArr[i+1] = value; ///    INSERT INTO NEXT RIGHT PLACE OF CURRENT ONE
            nItems++;
        }
    }

    public int remove(){
        return intArr[--nItems];
    }

    public int peekFront(){
        return intArr[--nItems];
    }

    public boolean isEmpty(){
        return  nItems == 0;
    }

    public boolean isFull(){
        return  nItems == maxSize;
    }

    public int size(){
        return  nItems;
    }

}
