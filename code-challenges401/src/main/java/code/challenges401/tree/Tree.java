package code.challenges401.tree;

import code.challenges401.linkedlist.LinkedList;

import java.util.ArrayList;

public class Tree<T extends Comparable<T>>{
    Node<T> root;

    Tree(){
        Node.kAry = 2;
    }

    Tree(int kArySize){
        Node.kAry = kArySize;
    }

    protected Node<T> getRoot(){
        return this.root;
    }
    public boolean isEmpty(){
        return root == null ? true : false;
    }
}
