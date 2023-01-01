package com.StackAndQueue;

public class StackTest {
    public static void main(String[] args) {
        IntStack intStack = new IntStack(10000);
        for (int i = 0; i < 10000; i++) {
            // long start = System.nanoTime();
            int randomNum = (int) (Math.random() * 10000);
            intStack.push(randomNum);
            System.out.println("Insert:"+randomNum);
        }
        while(!intStack.isEmpty()){
            System.out.println("Pop:"+intStack.pop());
        }
    }
}
