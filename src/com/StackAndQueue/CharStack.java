package com.StackAndQueue;

/**
 * A Character Stack
 */
public class CharStack {
    private char[] charArr;
    private int maxSize;
    private int top;

    public CharStack(int max){ maxSize = max; charArr = new char[max]; top = -1;}

    public void push(char value){ charArr[++top] = value; }
    public char pop(){return charArr[top--];};
    public char peek(){return  charArr[top];}
    public boolean isEmpty() { return top == -1;}
    public boolean isFull(){return top == maxSize-1;}
}
