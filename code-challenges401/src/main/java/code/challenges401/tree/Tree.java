package code.challenges401.tree;

import code.challenges401.linkedlist.LinkedList;

public class Tree<T extends Comparable<T>>{
    private Node<T> root;

    Tree(){
        this.root = null;
    }

    protected Node<T> getRoot(){
        return this.root;
    }
    public boolean isEmpty(){
        return root == null ? true : false;
    }
}
