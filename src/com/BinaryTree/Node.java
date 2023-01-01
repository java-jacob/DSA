package com.BinaryTree;

/**
 * Basis of a Tree.
 *
 */
public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;
    public Node(int data){this.data = data;}
    public int data(){return data;}
    public Node leftChild(){
        return leftChild;
    }
    public Node rightChild(){ return rightChild;}
    public void leftChild(Node child){this.leftChild = child;}
    public void rightChild(Node child){this.rightChild = child;}

}
