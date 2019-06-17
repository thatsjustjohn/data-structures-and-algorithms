package code.challenges401.tree;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> extends Tree<T> {
    BTNode<T> root;
    ArrayList<Object> returnList;

    public BinaryTree() {
        super();
    }

    public ArrayList<Object> preOrder(){
        returnList = new ArrayList<>();
        preOrder(root);
        return returnList;
    }

    public void preOrder(BTNode node){
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

    public void inOrder(BTNode node){
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

    public void postOrder(BTNode node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        returnList.add(node.value);
    }

    public boolean isEmpty(){
        return root == null ? true : false;
    }
}
