package com.StackAndQueue;


public class QueueTester {
    public static void main(String[] args) {
       /* IntQueue intQueue = new IntQueue(10);
        for (int i = 0; i < 10; i++) {
            // long start = System.nanoTime();
            int randomNum = (int) (Math.random() * 10);
            intQueue.insert(randomNum);
            System.out.println("Insert:"+randomNum);
        }
        while(!intQueue.isEmpty()){
            System.out.println("Remove:"+intQueue.remove());
        }*/


        PriorityIntQ priorityIntQueue = new PriorityIntQ(100);
        for (int i = 0; i < 100; i++) {
            // long start = System.nanoTime();
            int randomNum = (int) (Math.random() * 100);
            priorityIntQueue.insert(randomNum);
            System.out.println("Insert:"+randomNum);
        }
        while(!priorityIntQueue.isEmpty()){
            System.out.println("Remove:"+priorityIntQueue.remove());
        }

    }
}
