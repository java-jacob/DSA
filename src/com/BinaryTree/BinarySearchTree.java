package com.BinaryTree;

public class BinarySearchTree {
    private Node root;

    public Node root(){
        return root;
    }


    /**
     * *************BST INSERT****************
     * @param data
     */
    public void insert(int data){
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node previous;
            while (true) {
                previous = current;
                if (data < current.data()) {
                    current = current.leftChild();
                    if(current == null){
                        previous.leftChild(newNode);
                        return;
                    }
                } else {                                //DATA >= root
                    current = current.rightChild();
                    if(current == null){
                        previous.rightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    /**
     * BST find a Key
     * @param key
     * @return
     */
    public Node find(int key){
        Node current = root;
        while(current.data() != key){
            if(key < current.data()){
                current = current.leftChild();
            } else {
                current = current.rightChild();
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }

    /**
     * INORDER TRAVERSAL
     * @param node
     */
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.leftChild());
            System.out.println("InOrder:"+node.data());
            inOrder(node.rightChild());
        }
    }

    /**
     * PRE ORDER  TRAVERSAL
     * @param node
     */
    public void preOrder(Node node){
        if(node != null){
            System.out.println("PreOrder:"+node.data());
            preOrder(node.leftChild());
            preOrder(node.rightChild());
        }
    }

    /**
     * POST TRAVERSAL
     * @param node
     */
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.rightChild());
            postOrder(node.leftChild());
            System.out.println("PostOrder:"+node.data());
        }
    }
}
