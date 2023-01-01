package com.StackAndQueue;

/**
 * An Integer Stack
 */
public class IntStack {
    private int intArr[];
    private int maxSize;
    private int top;

    public IntStack(int max){ maxSize = max; intArr = new int[max]; top = -1;}

    public void push(int value){ intArr[++top] = value; }
    public int pop(){return intArr[top--];};
    public int peek(){return  intArr[top];}
    public boolean isEmpty() { return top == -1;}
    public boolean isFull(){return top == maxSize-1;}
}
