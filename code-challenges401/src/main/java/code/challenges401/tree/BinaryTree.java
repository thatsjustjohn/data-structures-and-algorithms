package code.challenges401.tree;

import code.challenges401.linkedlist.LinkedList;
import code.challenges401.stacksandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> extends Tree<T> {
    BTNode<T> root;
    ArrayList<Object> returnList;

    public BinaryTree() {
        super();
    }

    public BinaryTree(T value){
        super();
        this.root = new BTNode<>(value);
    }

    @Override
    public BTNode<T> getRoot() {
        return root;
    }

    public ArrayList<Object> preOrder(){
        returnList = new ArrayList<>();
        preOrder(root);
        return returnList;
    }

    private void preOrder(BTNode node){
        if(node == null) return;
        returnList.add(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public ArrayList<Object> inOrder(){
        returnList = new ArrayList<>();
        inOrder(root);
        return returnList;
    }

    private void inOrder(BTNode node){
        if(node == null) return;
        inOrder(node.left);
        returnList.add(node.value);
        inOrder(node.right);
    }

    public ArrayList<Object> postOrder(){
        returnList = new ArrayList<>();
        postOrder(root);
        return returnList;
    }

    private void postOrder(BTNode node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        returnList.add(node.value);
    }

    public void breadthFirst(BinaryTree bt){
        Queue<BTNode> q = new Queue();
        q.enqueue(bt.root);
        while(!q.isEmpty()){
            BTNode node = q.dequeue();
            System.out.println(node.value);
            if(node.left != null) q.enqueue(node.left);
            if(node.right != null) q.enqueue(node.right);
        }
    }

    public int findMaximumValue(BinaryTree bt){
        if(bt.root == null) throw new IllegalArgumentException();
        return findMaximumValueHelper(bt.root);

    }

    private int findMaximumValueHelper(BTNode node){
        int max;
        try{
            max = (int) node.value;
        }catch(ClassCastException e){
            throw new IllegalArgumentException();
        }
        if(node.left != null) max = Math.max(max, findMaximumValueHelper(node.left));
        if(node.right != null) max = Math.max(max, findMaximumValueHelper(node.right));
        return max;
    }

    public boolean isEmpty(){
        return this.root == null ? true : false;
    }
}
