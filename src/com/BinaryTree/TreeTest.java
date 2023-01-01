package com.BinaryTree;

public class TreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0 ; i < 10; i ++){
            int randomInt = (int)(10*Math.random());
            System.out.println("Rand:"+randomInt);
            bst.insert(randomInt);
        }
        bst.inOrder(bst.root());
        bst.preOrder(bst.root());
        bst.postOrder(bst.root());
    }
}
