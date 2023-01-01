package com.LinkedLists;

public class Link {
    private Link next;
    private int data;

    public Link(int data){
        this.data = data;
    }

    public void display(){
        System.out.println("Data:"+data);
    }

    public Link next() { return next;}
    public void setNext(Link next){this.next = next;}
    public int data() {return data;}
}
