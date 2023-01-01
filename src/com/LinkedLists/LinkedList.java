package com.LinkedLists;

public class LinkedList {
    private Link first;
    public void LinkedList(){first = null;}
    public boolean isEmpty(){return first == null;}


    public void insertFirst(int data){
        Link newLink = new Link(data);
        if(first == null){
            first = newLink;
        } else {
            newLink.setNext(first);
            first = newLink;
        }
    }

    public Link deleteFirst(){
        Link firstToDelete =null;
        if(first != null){
            firstToDelete = first;
            first = first.next();             //DELETED
        }
        return  firstToDelete;
    }
    public void displayList(){
        Link displayLink = first;
        while(displayLink != null){
            displayLink.display();
            displayLink = displayLink.next();
        }
    }
    //O(N)
    public Link find(int key){                      //Find Link with Key
        Link current = first;                       //Assume non empty List
        while(current.data() != key){               //Loop till key
            if(current.next() == null){             //No data till end
                return null;
            } else  current  = current.next();      //Advance
        }
        return current;                             //Found
    }

    /**
     * SIMPLE BUT BIT LOGIC
     *
     * @param key
     * @return
     */
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.data() != key){
            if(current.next() == null){                 //END COULDN'T FIND
                return  null;
            } else {
                previous = current;                     //GO NEXT , CACHE PREVIOUS
                current = current.next();
            }
        }
        if(current == first){
            first = null;
        } else {
            previous.setNext(current.next());           //CORE LOGIC
        }
        return current;
    }
}
