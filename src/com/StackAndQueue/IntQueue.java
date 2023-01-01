package com.StackAndQueue;

public class IntQueue {
    private int intArr[];
    private int size;
    private int front;
    private int rear;
    private int maxSize;

    public IntQueue(int max){
        this.maxSize = size;
        intArr = new int[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insert(int value){
        if(rear == maxSize-1){
            rear = -1;              //Deal with Wrap Around, rear is similar to top in Stack.
        }
        intArr[++rear] = value;
        size++;
    }

    public int remove(){
        int temp = intArr[front++];
        if(front==maxSize){
            front = 0;          //RESET - Wrap around
        }
        size--;
        return temp;
    }

    public int peekFront(){
        return intArr[front];
    }

    public boolean isEmpty(){
        return  size == 0;
    }

    public boolean isFull(){
        return  size == maxSize;
    }

    public int size(){
        return  size;
    }

}
